package jk.om.adapter.db.rdbms.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.om.common.domain.OrderRequest;

@Entity(name = "OrderRequestImpl")
@Table(name = "order_request")
public class OrderRequestImpl extends OrderRequest implements Serializable {

	private static final long serialVersionUID = 1L;

}
