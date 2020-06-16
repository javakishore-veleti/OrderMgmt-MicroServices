package jk.om.adapter.db.rdbms.dao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jk.om.adapter.db.rdbms.model.AddressImpl;
import jk.om.common.dao.AddressDAO;

@ConditionalOnProperty(name = "om.adapter.rdbms.enabled", havingValue = "true")
@Repository
public interface AddressDAOImpl extends AddressDAO, CrudRepository<AddressImpl, Long> {

	default public AddressImpl createDomainImplInstance() {
		return new AddressImpl();
	}

}
