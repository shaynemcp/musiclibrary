package com.personal.projects.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
	int id;
	String username;
	String password;
	String firstName;
	String lastName;

}
