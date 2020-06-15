package jk.om.common.dao;

import org.springframework.data.repository.CrudRepository;

import jk.om.common.domain.Order;

public interface OrderDAO extends CrudRepository<Order, Long> {

}
