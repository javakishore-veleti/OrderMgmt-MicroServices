package jk.om.adapter.db.rdbms.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.om.common.domain.Order;

@Entity(name = "OrderImpl")
@Table(name = "order_info")
public class OrderImpl extends Order implements Serializable {

	private static final long serialVersionUID = 1L;

}
