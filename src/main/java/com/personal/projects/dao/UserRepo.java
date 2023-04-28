package com.personal.projects.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.projects.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	public abstract User findByUsername(String username);
	
	public abstract User findByUsernameAndPassword(String username, String password);
	
}
