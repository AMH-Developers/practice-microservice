package com.spring.boot.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.employee.model.CustomerDetails;
import com.spring.boot.employee.model.OrderDetails;
import com.spring.boot.employee.repository.CustomerRepository;
import com.spring.boot.employee.repository.OrderRepository;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	public CustomerDetails addCustomerAndOrder(CustomerDetails customer) {
		CustomerDetails cd = customerRepository.save(customer);
		return cd;
	}

	public OrderDetails addOrder(OrderDetails order) {
		OrderDetails od = orderRepository.save(order);
		return od;
	}

	public List<CustomerDetails> getCustomer() {
		List<CustomerDetails> customer = customerRepository.findAll();
		return customer;
	}

	public List<OrderDetails> getOrder() {
		List<OrderDetails> order = orderRepository.findAll();
		return order;
	}

	public String findCustomerById(Long id) {
		Optional <CustomerDetails> customer = customerRepository.findById(id);
		if(customer.isPresent()) {
			return "customer available";
		}else {
			return null;
		}
	}
	
	public String findOrderById(Long id) {
		Optional <OrderDetails> order = orderRepository.findById(id);
		if(order.isPresent()) {
			return "order available";
		}else {
			return null;
		}
	}

	public CustomerDetails findByName(String name) {
		CustomerDetails customer = customerRepository.findByName(name);
		return customer;
	}

	public OrderDetails findByStatus(String status) {
		OrderDetails order = orderRepository.findByStatus(status);
		return order;
	}

	
	
	
	}


