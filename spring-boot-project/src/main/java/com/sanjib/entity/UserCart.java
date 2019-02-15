package com.sanjib.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userCart")
public class UserCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long userId;
	private Long productId;
	private BigDecimal price;
	private BigDecimal quantity;
	private String cartReference;

	public UserCart() {

	}

	public UserCart(Long id, Long userId, Long productId, BigDecimal price, BigDecimal quantity, String cartReference) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
		this.cartReference = cartReference;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getCartReference() {
		return cartReference;
	}

	public void setCartReference(String cartReference) {
		this.cartReference = cartReference;
	}

	@Override
	public String toString() {
		return "UserCart [id=" + id + ", userId=" + userId + ", productId=" + productId + ", price=" + price
				+ ", quantity=" + quantity + ", cartReference=" + cartReference + "]";
	}

}
