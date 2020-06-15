package jk.om.common.dao;

import org.springframework.data.repository.CrudRepository;

import jk.om.common.domain.OrderRequest;

public interface OrderRequestDAO extends CrudRepository<OrderRequest, Long> {

}
