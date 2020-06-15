package jk.om.adapter.db.rdbms.dao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import jk.om.common.dao.AddressDAO;

@ConditionalOnProperty(name = "OM.ADAPTER.RDBMS.ENABLED", havingValue = "true")
@Repository
public interface AddressDAOImpl extends AddressDAO {

}
