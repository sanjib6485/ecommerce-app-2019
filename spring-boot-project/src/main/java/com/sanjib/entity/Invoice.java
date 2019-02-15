package com.sanjib.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long user_id;
	private String shippingAddress;
	private String status;
	private BigDecimal total;
	private BigDecimal tax;
	private BigDecimal deleveryCharges;
	private BigDecimal grossTotal;

	public Invoice() {

	}

	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Long getUser_id() {
		return user_id;
	}



	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}



	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getDeleveryCharges() {
		return deleveryCharges;
	}

	public void setDeleveryCharges(BigDecimal deleveryCharges) {
		this.deleveryCharges = deleveryCharges;
	}

	public BigDecimal getGrossTotal() {
		return grossTotal;
	}

	public void setGrossTotal(BigDecimal grossTotal) {
		this.grossTotal = grossTotal;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", userId=" + userId + ", shippingAddress=" + shippingAddress + ", status="
				+ status + ", total=" + total + ", tax=" + tax + ", deleveryCharges=" + deleveryCharges
				+ ", grossTotal=" + grossTotal + "]";
	}

}
