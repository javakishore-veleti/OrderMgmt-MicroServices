package jk.om.common.domain;

import java.io.Serializable;
import java.util.Date;

public class BaseDomain implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String status;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedOn;

	public BaseDomain() {
	}

	public BaseDomain(Long id, String status, Date createdAt, Date updatedAt, Date deletedOn) {
		super();
		this.id = id;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedOn = deletedOn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getDeletedOn() {
		return deletedOn;
	}

	public void setDeletedOn(Date deletedOn) {
		this.deletedOn = deletedOn;
	}

	@Override
	public String toString() {
		return "BaseDomain [id=" + id + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", deletedOn=" + deletedOn + "]";
	}

}
