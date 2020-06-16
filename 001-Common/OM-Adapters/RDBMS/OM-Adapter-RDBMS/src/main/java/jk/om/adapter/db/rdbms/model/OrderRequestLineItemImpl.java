package jk.om.adapter.db.rdbms.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.om.common.domain.OrderRequestLineItem;

@Entity(name = "OrderRequestLineItemImpl")
@Table(name = "order_request_lineitem")
public class OrderRequestLineItemImpl extends OrderRequestLineItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "OrderRequestLineItemImpl [toString()=" + super.toString() + "]";
	}

}
