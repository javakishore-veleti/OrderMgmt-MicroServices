package jk.om.adapter.db.rdbms.dao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jk.om.adapter.db.rdbms.model.CustomerProfileImpl;
import jk.om.common.dao.CustomerProfileDAO;

@ConditionalOnProperty(name = "om.adapter.rdbms.enabled", havingValue = "true")
@Repository
public interface CustomerProfileDAOImpl extends CustomerProfileDAO, CrudRepository<CustomerProfileImpl, Long> {

	default public CustomerProfileImpl createDomainImplInstance() {
		return new CustomerProfileImpl();
	}

}
