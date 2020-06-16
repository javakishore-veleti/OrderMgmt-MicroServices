package jk.om.common.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Order extends BaseDomain {

	private static final long serialVersionUID = 1L;

	@Column(name = "customer_id")
	private Long customerId;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "status")
	private String status;

	public Order() {
	}

	public Order(Long id, Long customerId) {
		super();
		this.customerId = customerId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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
