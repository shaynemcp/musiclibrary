package com.personal.projects.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.projects.dao.UserRepo;
import com.personal.projects.model.User;

@RestController
public class UserController {
	@Autowired
	private UserRepo userRepo;
	
	public UserController (UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	//register a new user
//    @PostMapping
//    public ResponseEntity createClient(@RequestBody User user) throws URISyntaxException {
//        User newUser = userRepo.save(user);
//        return ResponseEntity.created(new URI("/clients/" + newUser.getId())).body(newUser);
//    }

}
