package jk.om.adapter.db.rdbms.dao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jk.om.adapter.db.rdbms.model.OrderLineItemImpl;
import jk.om.common.dao.OrderLineItemDAO;

@ConditionalOnProperty(name = "om.adapter.rdbms.enabled", havingValue = "true")
@Repository
public interface OrderLineItemDAOImpl extends OrderLineItemDAO, CrudRepository<OrderLineItemImpl, Long> {

	default public OrderLineItemImpl createDomainImplInstance() {
		return new OrderLineItemImpl();
	}

}
