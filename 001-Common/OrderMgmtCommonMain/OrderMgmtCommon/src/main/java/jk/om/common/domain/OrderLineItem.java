package jk.om.common.domain;

import java.math.BigDecimal;
import java.util.Date;

public class OrderLineItem {

	private Long id;

	private String status;
	private Date createdAt;

	private Long productId;
	private Integer quantity;
	private BigDecimal unitPrice;
	private BigDecimal totalPrice;
	private BigDecimal discount;
	private BigDecimal unitTax;
	private BigDecimal totalTax;
	private BigDecimal totalCost;

	public OrderLineItem() {
	}

	public OrderLineItem(Long id, String status, Date createdAt, Long productId, Integer quantity, BigDecimal unitPrice,
			BigDecimal totalPrice, BigDecimal discount, BigDecimal unitTax, BigDecimal totalTax, BigDecimal totalCost) {
		super();
		this.id = id;
		this.status = status;
		this.createdAt = createdAt;
		this.productId = productId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
		this.discount = discount;
		this.unitTax = unitTax;
		this.totalTax = totalTax;
		this.totalCost = totalCost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "OrderLineItem [id=" + id + ", status=" + status + ", createdAt=" + createdAt + ", productId="
				+ productId + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice
				+ ", discount=" + discount + ", unitTax=" + unitTax + ", totalTax=" + totalTax + ", totalCost="
				+ totalCost + "]";
	}

}
