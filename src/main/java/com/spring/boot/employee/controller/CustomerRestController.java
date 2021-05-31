package com.spring.boot.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.employee.model.CustomerDetails;
import com.spring.boot.employee.model.OrderDetails;
import com.spring.boot.employee.service.CustomerService;


@RestController
public class CustomerRestController {


	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/addCustomer")
	public CustomerDetails addCustomer(@RequestBody CustomerDetails customer) {
		return customerService.addCustomerAndOrder(customer) ;
	}
	
	@PostMapping("/addOrder")
	public OrderDetails addOrder(@RequestBody OrderDetails order) {
		return customerService.addOrder(order);
	}
	
	@GetMapping("/customer")
	public List<CustomerDetails> getCustomer(){
		return customerService.getCustomer();
	}
	
	@GetMapping("/order")
	public List<OrderDetails> getOrder(){
		return customerService.getOrder();
	}
	
	@GetMapping("/findCustomerById/{id}")
	public String findCustomerById(@PathVariable Long id) {
		return customerService.findCustomerById(id);
	}
	
	@GetMapping("/findOrderById/{id}")
	public String findOrderById(@PathVariable Long id) {
		return customerService.findOrderById(id);
	}
	
	@GetMapping("/findByName/{name}")
	public CustomerDetails findByName(@PathVariable String name) {
		CustomerDetails customer = customerService.findByName(name);
		return customer;
	}
	
	@GetMapping("/getOrderByStatus/{status}")
	public OrderDetails findByStatus(@PathVariable String status) {
		OrderDetails order = customerService.findByStatus(status);
		return order;
	}
	
}
