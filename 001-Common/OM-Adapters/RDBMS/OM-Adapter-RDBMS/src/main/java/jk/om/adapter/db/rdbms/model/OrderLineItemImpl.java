package jk.om.adapter.db.rdbms.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.om.common.domain.OrderLineItem;

@Entity(name = "OrderLineItemImpl")
@Table(name = "order_lineitem")
public class OrderLineItemImpl extends OrderLineItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "OrderLineItemImpl [toString()=" + super.toString() + "]";
	}

}
