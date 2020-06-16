package jk.om.common.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import jk.om.common.constants.ApiConstants;

public class ServiceResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String status = ApiConstants.SUCCESS;
	private Map<String, Object> response = new HashMap<>();

	public ServiceResponse() {
		super();
	}

	public ServiceResponse(String status, Map<String, Object> response) {
		super();
		this.status = status;
		this.response = response;
	}

	public ServiceResponse(Map<String, Object> response) {
		super();
		this.response = response;
	}

	public ServiceResponse addResponse(String key, Object value) {
		this.response.put(key, value);
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Map<String, Object> getResponse() {
		return response;
	}

	public void setResponse(Map<String, Object> response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ServiceUpdateInfo [status=" + status + ", response=" + response + "]";
	}

}
