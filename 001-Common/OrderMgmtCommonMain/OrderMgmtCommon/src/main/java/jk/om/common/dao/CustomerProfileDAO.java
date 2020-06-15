package jk.om.common.dao;

import org.springframework.data.repository.CrudRepository;

import jk.om.common.domain.CustomerProfile;

public interface CustomerProfileDAO extends CrudRepository<CustomerProfile, Long> {

}
