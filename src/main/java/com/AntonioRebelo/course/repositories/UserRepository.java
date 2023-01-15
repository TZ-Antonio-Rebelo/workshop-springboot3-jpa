package com.AntonioRebelo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AntonioRebelo.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
