package org.mule.module.intacct.impl;

import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

public interface IntacctRestClient {

	Response postXml(String xml);

	void addSslConfiguration();

}
