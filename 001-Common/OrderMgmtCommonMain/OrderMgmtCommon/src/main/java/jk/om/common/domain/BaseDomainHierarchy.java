package jk.om.common.domain;

import java.util.Date;

public class BaseDomainHierarchy extends BaseDomain {

	private static final long serialVersionUID = 1L;

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
