package jk.om.common.dao;

import org.springframework.data.repository.CrudRepository;

import jk.om.common.domain.Address;

public interface AddressDAO extends CrudRepository<Address, Long> {

}
