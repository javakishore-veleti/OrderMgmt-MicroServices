package jk.om.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public class Order extends BaseDomain {

	private static final long serialVersionUID = 1L;

	@Column(name = "customer_id")
	private Long customerId;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "status")
	private String status;

	@Transient
	private List<OrderLineItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(Long id, Long customerId, List<OrderLineItem> items) {
		super();
		this.customerId = customerId;
		this.items = items;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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

}
