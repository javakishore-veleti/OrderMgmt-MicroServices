package jk.om.common.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class OrderLineItem extends BaseDomainHierarchy {

	private static final long serialVersionUID = 1L;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "unit_price")
	private BigDecimal unitPrice;

	@Column(name = "total_price")
	private BigDecimal totalPrice;

	@Column(name = "discount")
	private BigDecimal discount;

	@Column(name = "unit_tax")
	private BigDecimal unitTax;

	@Column(name = "total_tax")
	private BigDecimal totalTax;

	@Column(name = "total_cost")
	private BigDecimal totalCost;

	public OrderLineItem() {
	}

	public OrderLineItem(Long id, String status, Date createdAt, Long productId, Integer quantity, BigDecimal unitPrice,
			BigDecimal totalPrice, BigDecimal discount, BigDecimal unitTax, BigDecimal totalTax, BigDecimal totalCost) {
		super();
		super.setId(id);
		super.setStatus(status);
		super.setCreatedAt(createdAt);

		this.productId = productId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
		this.discount = discount;
		this.unitTax = unitTax;
		this.totalTax = totalTax;
		this.totalCost = totalCost;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getUnitTax() {
		return unitTax;
	}

	public void setUnitTax(BigDecimal unitTax) {
		this.unitTax = unitTax;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "OrderLineItem [productId=" + productId + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", totalPrice=" + totalPrice + ", discount=" + discount + ", unitTax=" + unitTax + ", totalTax="
				+ totalTax + ", totalCost=" + totalCost + ", toString()=" + super.toString() + "]";
	}

}
