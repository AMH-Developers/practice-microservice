package com.spring.boot.employee.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class CustomerDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	private String name;
	private String email;
	private int age;
	private Date dob;
	
//	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "customer_order", joinColumns = @JoinColumn(name = "customer_id"),
				inverseJoinColumns = @JoinColumn(name = "order_id"))
	private List<OrderDetails> orderDetails;

	public CustomerDetails() {
		super();
	}

	public CustomerDetails(long customerId, String name, String email, int age, Date dob,
			List<OrderDetails> orderDetails) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
		this.orderDetails = orderDetails;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", dob=" + dob + ", orderDetails=" + orderDetails + "]";
	}
	
	
	
	
	
}



