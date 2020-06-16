package jk.om.common.dto;

import jk.om.common.domain.BaseDomain;

public class CrudServiceUpdateInfo<T extends BaseDomain> {

	private T domainObject;

	public CrudServiceUpdateInfo() {
		super();
	}

	public CrudServiceUpdateInfo(T domainObject) {
		super();
		this.domainObject = domainObject;
	}

	public T getDomainObject() {
		return domainObject;
	}

	public void setDomainObject(T domainObject) {
		this.domainObject = domainObject;
	}

}
