package com.AntonioRebelo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AntonioRebelo.course.entities.User;
import com.AntonioRebelo.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User finfById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	

}
