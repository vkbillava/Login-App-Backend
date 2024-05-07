package com.vkbillava.login.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vkbillava.login.payload.LoginAppDto;

public interface LoginAppService {
	
	LoginAppDto createUser(LoginAppDto userDto);
	
	List<LoginAppDto> getAllUsers();

}
