package jk.om.adapter.db.rdbms.dao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jk.om.adapter.db.rdbms.model.OrderImpl;
import jk.om.common.dao.OrderDAO;

@ConditionalOnProperty(name = "om.adapter.rdbms.enabled", havingValue = "true")
@Repository
public interface OrderDAOImpl extends OrderDAO, CrudRepository<OrderImpl, Long> {

	default public OrderImpl createDomainImplInstance() {
		return new OrderImpl();
	}

}
