package com.spring.boot.employee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.employee.model.OrderDetails;




@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Long>{

	OrderDetails findByStatus(String status);
}
