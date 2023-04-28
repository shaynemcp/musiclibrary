//package com.personal.projects.service;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.personal.projects.dao.UserRepo;
//import com.personal.projects.model.User;
//
//@Service
//public class UserServiceImpl implements UserService{
//	
//	private UserRepo userRepo;
//
//  public boolean userExists(String username) {
//    return userRepo.findByUsername(username) != null;
//  }
//  
//  public List<User> findAllUsers(User user){
//	  List<User> users = userRepo.findAll();
//	  return users;
//  }
//  
////  public void register(User user) {
////	  if (userExists(user.)) {
////		return "This username is already in use";
////	}
////  }
//  
//
//}
