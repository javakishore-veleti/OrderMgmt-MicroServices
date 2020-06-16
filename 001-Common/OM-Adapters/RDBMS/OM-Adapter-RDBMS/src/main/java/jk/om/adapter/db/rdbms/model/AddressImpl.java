package jk.om.adapter.db.rdbms.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.om.common.domain.Address;

@Entity(name = "AddressImpl")
@Table(name = "address")
public class AddressImpl extends Address implements Serializable {

	private static final long serialVersionUID = 1L;

}
