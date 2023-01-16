package com.AntonioRebelo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AntonioRebelo.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
