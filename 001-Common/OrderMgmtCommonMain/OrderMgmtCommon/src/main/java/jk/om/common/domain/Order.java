package jk.om.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private Long id;
	private Customer customer;
	private Date createdAt;
	private String status;

	private List<OrderLineItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(Long id, Customer customer, List<OrderLineItem> items) {
		super();
		this.id = id;
		this.customer = customer;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderLineItem> getItems() {
		return items;
	}

	public void setItems(List<OrderLineItem> items) {
		this.items = items;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", createdAt=" + createdAt + ", status=" + status
				+ ", items=" + items + "]";
	}

}
