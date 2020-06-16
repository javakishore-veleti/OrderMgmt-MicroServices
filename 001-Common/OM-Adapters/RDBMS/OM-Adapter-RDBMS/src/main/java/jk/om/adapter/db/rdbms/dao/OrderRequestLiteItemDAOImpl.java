package jk.om.adapter.db.rdbms.dao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import jk.om.adapter.db.rdbms.model.OrderRequestLineItemImpl;
import jk.om.common.dao.OrderRequestLineItemDAO;

@ConditionalOnProperty(name = "om.adapter.rdbms.enabled", havingValue = "true")
@Repository
public interface OrderRequestLiteItemDAOImpl extends OrderRequestLineItemDAO<OrderRequestLineItemImpl>,
		RDBMSBaseDomainDAOImpl<OrderRequestLineItemImpl, Long> {

	default public OrderRequestLineItemImpl createDomainImplInstance() {
		return new OrderRequestLineItemImpl();
	}

}
