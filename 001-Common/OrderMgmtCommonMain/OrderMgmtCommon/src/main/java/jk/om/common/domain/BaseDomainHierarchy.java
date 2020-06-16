package jk.om.common.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseDomainHierarchy extends BaseDomain {

	private static final long serialVersionUID = 1L;

	@Column(name = "parent_id")
	private Long parentId;

	public BaseDomainHierarchy() {
	}

	public BaseDomainHierarchy(Long id, String status, Date createdAt, Date updatedAt, Date deletedOn) {
		super(id, status, createdAt, updatedAt, deletedOn);
	}

	public BaseDomainHierarchy(Long parentId) {
		super();
		this.parentId = parentId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "BaseDomainHierarchy [parentId=" + parentId + ", toString()=" + super.toString() + "]";
	}

}
