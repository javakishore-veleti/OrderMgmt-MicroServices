package jk.om.common.dao;

import org.springframework.data.repository.CrudRepository;

import jk.om.common.domain.OrderLineItem;

public interface OrderLineItemDAO extends CrudRepository<OrderLineItem, Long> {

}
