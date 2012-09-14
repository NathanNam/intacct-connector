/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.intacct.response;

import java.util.List;

import org.mule.module.intacct.schema.response.Error;
import org.mule.module.intacct.schema.response.ErrorMessage;
import org.mule.module.intacct.schema.response.Operation;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.schema.response.Result;

public class IntacctResponseWrapper {
	
	private static final String SUCCESS_STATUS = "success";

	/**
	 * The original response from intacct web services
	 * */
	private Response response;
	
	/**
	 * The data received as a list of Objects
	 * */
	private List<Object> dataList;
	
	/**
	 * The status of the operation execution
	 * */
	private boolean requestSuccess;

	/**
	 * The error retrieve from the response, if any
	 * */
	private Error error;
	
	public IntacctResponseWrapper(final Response response)
	{
		this.setResponse(response);
		setData();
	}

	@SuppressWarnings("unchecked")
	private void setData() {
		List<? extends Object> results;
		if(response.getOperationOrErrormessage().size() > 0)
		{
			Object opOrError = response.getOperationOrErrormessage().get(0);
			if ((opOrError) instanceof ErrorMessage)
			{
				this.requestSuccess = false;
				this.error = ((ErrorMessage) opOrError).getError().get(0);
			} else {
				results = ((Operation)opOrError).getErrormessageOrResult();
				List<Result> resultList = (List<Result>) results;
				if(resultList.get(0).getStatus().equals(SUCCESS_STATUS))
				{
					this.requestSuccess = true;
					if(resultList.get(0).getData() != null)
					{
					    this.dataList = resultList.get(0).getData().getDataList();
					}
					
				} else {
					this.requestSuccess = false;
					this.setError(resultList.get(0).getErrormessage().getError().get(0));
				}
			}
		}
	}

	public List<Object> getDataList() {
		return dataList;
	}

	public void setDataList(List<Object> dataList) {
		this.dataList = dataList;
	}

	public boolean isRequestSuccess() {
		return requestSuccess;
	}

	public void setRequestSuccess(boolean requestSuccess) {
		this.requestSuccess = requestSuccess;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
	
}