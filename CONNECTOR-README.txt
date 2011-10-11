---++ Readme for the Cloud Connector

Intacct's API is XML based. They provide two sets of DTDs. One for the 
requests, and another for the responses. All the requests (regardless of the API's
function that is being invoked) have some similarities. For example 
the API call for the get_invoice function looks like this:
---------------8<---------------------8<----------------------
     <?xml version="1.0" encoding="UTF-8"?>
     <!DOCTYPE request SYSTEM "intacct_request.v2.1.dtd">
     <request>
      <control>
       <senderid>intacct_dev</senderid>
       <password>babbage</password>
       <controlId>XML Sample</controlId>
      </control>
      <operation>
       <authentication>
        <login>
         <userId>xmluser</userId>
         <companyId>XML Sample</companyId>
         <password>abc123</password>
        </login>
       </authentication>
       <content>
         <function controlId="testControlId">
            <get_invoice key="XXXX"/>
         </function>
       </content>
      </operation>
     </request>
---------------8<---------------------8<----------------------


Inside the function element resides the API call we want to do this time. 
The rest of the XML has always the same structure. The importance of the other part
are the values of the authentication and control.
Not all the functions have simple arguments.
Most of the API calls have complex data types. Let's see the
following example of the get_list function:


---------------8<---------------------8<----------------------
     ...
     <content>
      <function controlId="f4">
       <get_list object="glaccount">
        <filter>
         <logical logical_operator="or">
          <logical logical_operator="and">
           <expression>
            <field>accountno</field>
            <operator>&gt;</operator>
            <value>5000</value>
           </expression>
           <expression>
            <field>normalbalance</field>
            <operator>=</operator>
            <value>debit</value>
           </expression>
          </logical>
          <expression>
           <field>normalbalance</field>
           <operator>=</operator>
           <value>credit</value>
          </expression>
         </logical>
        </filter>
        <sorts>
         <sortfield order="asc">normalbalance</sortfield>
         <sortfield order="asc">title</sortfield>
        </sorts>
        <fields>
         <field>title</field>
         <field>normalbalance</field>
        </fields>
       </get_list>
      </function>
     </content>
---------------8<---------------------8<----------------------

Due to:
   * the protocol provides some data typing (DTDs) 
   * single end-point URL
   * all the API calls "looks similar"
   * the complexity (and powerful expression) of the operations

We think that it is a good idea that the "Intacct Mule Connector" sticks to the 
Intacct's content/function syntax, instead of defining another type of XML 
like Salesforce or the Authorize.net connectors.
However, the Intacct XML doesn't use standars. It uses '_' instead of '-'. 
We wanted our implementation to use the standards.
Besides that, we wanted the user to write the least possible. For that, 
we imagined that in the config element one would choose all the values
for the attributes in the custom header (like user id) and then just state
what API call one wanted to use.
However, we are also giving the user the possibility to write the whole request and override
the default values for the common header attributes.
Having this approach in mind, in order to add a new API call to this
cloud connector this add the steps you need to follow:



   1. Download the DTDs or the XSD from Intacct. They are saved for 
      future record in 
         src/main/resources/META-INF/dtds/request/ 
      and 
         src/main/resources/META-INF/dtds/response/
     In case you downloaded DTDs go to step 2.
     Otherwise go to Step 4b.
   
   2. With JAXB xjc.sh you need to generate the java classes that represent the schema
      (although DTD support is "experimental", it works better than trang's 
      conversion from dtd to xsd) for the request and the response 
      (classes are located at org.mule.module.intacct.schema.request and 
      org.mule.module.intacct.schema.response packages). This step could 
      eventually be automated with a maven jaxb plugin. It is important to 
      use two separate packages because request and response have some 
      types named the same with different attributes.
   4a. With the classes generated and compiled (mvn package) you have to
     use JAXB's schemagen 
        schemagen.sh -cp . org.mule.module.intacct.schema.request.Request
      to generate the XSD from the request element. This will be used as a 
      part of spring handler's XSD.(bottom of mule-intacct.xsd). 
      Go to step 5
   4b. With the XSD we need to generate the Java Classes for both the request
   	   and response. For that we use xjc.sh.
   5. You now have the XSD of the new elements. It is important that the
      XSD elements that represent the function have a type separated.
      You must add this XSD elements and types to the mule-intacct.xsd. 
      You also need to add the substitution group to the element like the following:
      
      <xs:element name="create_allocation" type="tns:create_allocationType"
		substitutionGroup="mule:abstract_message_processor" >
		
	  and then you need to add the inheritance to the type:
	  
	  <xs:complexType name="create_allocationType">
		<xsd:complexContent>
			<xsd:extension base="mule:abstractInterceptingMessageProcessorType">
			...
			...
			</xsd:extension>
		</xsd:complexContent>
	  </xs:complexType>
	  
   6. As we want the XSD to be a standard, we must replace every '_' with a '-' so that we
      can use the '-' when we declare a flow. We've created XmlFilters that will take care
      of changing all of the '_' to '-' from the element name, attributes, etc. So you don't
      need to worry about that! Besides that, we remove the namespace from the request from being
      sent because the intacct API doesn't allow it being sent. We do that with another XmlFilter
   
   7. We need to add to both the Function class and XSD element the new API call:
   <xs:complexType name="functionType">
		<xsd:complexContent>
			<xsd:extension base="mule:abstractInterceptingMessageProcessorType">
				<xs:sequence>
					<xs:choice maxOccurs="unbounded">
						<xs:element ref="tns:create-apaccountlabel" />
						<xs:element ref="tns:create-apadjustment" />
						...
						...
						...
						<xs:element ref="tns:create_allocation" />
						
   See the new line after the dots. It means that the command of the function can be now
   our new XSD element.
   We also need to add this to the annotation to the Function class in case we want to
   regenerate the XSD later:
   
   @XmlElements({
        @XmlElement(name = "create_apaccountlabel", required = true, type = CreateApaccountlabel.class),
        @XmlElement(name = "create_apadjustment", required = true, type = CreateApadjustment.class),
        ...
        ...
        @XmlElement(name = "reverse_cctransaction", required = true, type = ReverseCctransaction.class),
        @XmlElement(name = "create_allocation", required = true, type = CreateAllocation.class)})
    protected List<Object> cmd;
   
   See the new line above the cmd declaration.
   
   7. Now we need to add the new function to the NamespaceHandler so that it is checked,
   	  in the class:
   	  org.mule.module.intacct.config.IntacctNamespaceHandler
   	  
   	  private static final String [] API_FUNCTIONS = {
        "request",
        "function",
        "create-apaccountlabel",
        ...
        ...
        "create-allocation"
        };
      Check that here we add the create-allocation with '-' because when we declare the flow
      we will use it this way.

   8. And we're done! It's easy, right? Now we just need to use it and code a test to check if this
   is working.
   
   For example if we want to now use create-allocation we must do:
   
   <flow name="exampleFlow">
   	<intacct:create-allocation xmlns="http://www.mulesoft.org/schema/mule/intacct">
   		<allocationid>asdf</allocationid>
   		<description>asdf</description>
   		...
   		...
   		...
   	</intacct:create-allocation>
   </flow>
    