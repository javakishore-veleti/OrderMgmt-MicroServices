package jk.om.common.dto;

import jk.om.common.domain.OrderRequest;

public class OrderRequetInfo {

	private OrderRequest orderRequest;

	public OrderRequetInfo() {
		super();
	}

	public OrderRequetInfo(OrderRequest orderRequest) {
		super();
		this.orderRequest = orderRequest;
	}

	public OrderRequest getOrderRequest() {
		return orderRequest;
	}

	public void setOrderRequest(OrderRequest orderRequest) {
		this.orderRequest = orderRequest;
	}

	@Override
	public String toString() {
		return "OrderRequetInfo [orderRequest=" + orderRequest + "]";
	}

}
