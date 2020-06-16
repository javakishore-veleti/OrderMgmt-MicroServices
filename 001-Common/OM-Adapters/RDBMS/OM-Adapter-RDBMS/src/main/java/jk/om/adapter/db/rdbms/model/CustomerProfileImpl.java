package jk.om.adapter.db.rdbms.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.om.common.domain.CustomerProfile;

@Entity(name = "CustomerProfileImpl")
@Table(name = "customer_profile")
public class CustomerProfileImpl extends CustomerProfile implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "CustomerProfileImpl [toString()=" + super.toString() + "]";
	}

}
