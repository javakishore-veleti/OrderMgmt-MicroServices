package jk.om.adapter.db.rdbms.dao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import jk.om.adapter.db.rdbms.model.OrderRequestImpl;
import jk.om.common.dao.OrderRequestDAO;

@ConditionalOnProperty(name = "om.adapter.rdbms.enabled", havingValue = "true")
@Repository
public interface OrderRequestDAOImpl
		extends OrderRequestDAO<OrderRequestImpl>, RDBMSBaseDomainDAOImpl<OrderRequestImpl, Long> {

	default public OrderRequestImpl createDomainImplInstance() {
		return new OrderRequestImpl();
	}

}
