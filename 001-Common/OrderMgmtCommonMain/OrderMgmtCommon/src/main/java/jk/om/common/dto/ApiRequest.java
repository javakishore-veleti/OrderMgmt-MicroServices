package jk.om.common.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ApiRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> request = new HashMap<>();

	public Map<String, Object> getRequest() {
		return request;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public String toString() {
		return "ApiRequest [request=" + request + "]";
	}

}
