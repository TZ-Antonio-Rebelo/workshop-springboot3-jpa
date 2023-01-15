package com.AntonioRebelo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AntonioRebelo.course.entities.Order;
import com.AntonioRebelo.course.entities.User;
import com.AntonioRebelo.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order finfById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	

}
