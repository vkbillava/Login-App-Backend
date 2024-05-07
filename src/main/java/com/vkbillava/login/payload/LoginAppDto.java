package com.vkbillava.login.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginAppDto {

	private Integer id;
	
	@NotEmpty
	@Size(min = 4, message = "Username must be minimum 4 characters !!")
	private String username;
	
	@NotEmpty
	@Size(min = 4, max = 12, message = "Password must be minimum 4 characters and maximum 12 characters !!")
	private String password;
	
	@Email(message = "Email address is not valid !!")
	private String email;

}
