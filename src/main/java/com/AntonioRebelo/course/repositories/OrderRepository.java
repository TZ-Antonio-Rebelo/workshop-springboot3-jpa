package com.AntonioRebelo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AntonioRebelo.course.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
