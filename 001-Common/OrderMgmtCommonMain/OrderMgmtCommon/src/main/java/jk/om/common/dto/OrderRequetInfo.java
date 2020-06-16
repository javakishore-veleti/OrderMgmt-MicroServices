package jk.om.common.dto;

import java.util.List;

import jk.om.common.domain.OrderRequestLineItem;
import jk.om.common.domain.OrderRequest;

public class OrderRequetInfo {

	private OrderRequest orderRequest;
	private List<OrderRequestLineItem> items;

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

	public List<OrderRequestLineItem> getItems() {
		return items;
	}

	public void setItems(List<OrderRequestLineItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "OrderRequetInfo [orderRequest=" + orderRequest + "]";
	}

}
