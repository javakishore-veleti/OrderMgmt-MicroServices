package jk.om.common.pubsub.services;

import jk.om.common.domain.BaseDomain;
import jk.om.common.dto.CrudServiceUpdateInfo;

public interface CrudServiceListener<T extends BaseDomain> {

	void handleEvent(String crudType, CrudServiceUpdateInfo<T> serviceUpdateInfo) throws Exception;

}
