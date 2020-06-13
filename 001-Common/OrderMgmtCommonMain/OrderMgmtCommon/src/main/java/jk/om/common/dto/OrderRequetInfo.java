package jk.om.common.dto;

import jk.om.common.domain.Order;

public class OrderRequetInfo {

	private Order order;

	public OrderRequetInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderRequetInfo(Order order) {
		super();
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderRequetInfo [order=" + order + "]";
	}

}
