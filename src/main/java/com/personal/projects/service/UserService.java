package com.personal.projects.service;

import java.util.List;


import com.personal.projects.dto.UserDto;
import com.personal.projects.model.User;

public interface UserService {
	
	List<UserDto> findallUsers();
	
	void register(User user);
	
	User findUserByUsername(String username);
	
	
}
