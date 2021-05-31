package com.spring.boot.employee.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDetails {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;
	private int numberOfProducts;
	private int totalPrice;
	private String status;
	
	
	public OrderDetails() {
		super();
	}


	public OrderDetails(long orderId, int numberOfProducts, int totalPrice, String status) {
		super();
		this.orderId = orderId;
		this.numberOfProducts = numberOfProducts;
		this.totalPrice = totalPrice;
		this.status = status;
	}


	public long getOrderId() {
		return orderId;
	}


	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}


	public int getNumberOfProducts() {
		return numberOfProducts;
	}


	public void setNumberOfProducts(int numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", numberOfProducts=" + numberOfProducts + ", totalPrice="
				+ totalPrice + ", status=" + status + "]";
	}
	
	
	
	
}


