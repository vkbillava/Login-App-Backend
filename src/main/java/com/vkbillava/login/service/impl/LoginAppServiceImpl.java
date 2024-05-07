package com.vkbillava.login.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkbillava.login.entity.LoginApp;
import com.vkbillava.login.payload.LoginAppDto;
import com.vkbillava.login.repository.LoginAppRepo;
import com.vkbillava.login.service.LoginAppService;

@Service
public class LoginAppServiceImpl implements LoginAppService {
	
	@Autowired
	private LoginAppRepo loginAppRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public LoginAppDto createUser(LoginAppDto userDto) {
		
		LoginApp user = this.modelMapper.map(userDto, LoginApp.class);
		LoginApp savedUser = this.loginAppRepo.save(user);
		
		return this.modelMapper.map(savedUser, LoginAppDto.class);
	}

	@Override
	public List<LoginAppDto> getAllUsers() {
		
		List<LoginApp> users = this.loginAppRepo.findAll();
		
		List<LoginAppDto> allusers = users.stream().map(user -> this.modelMapper.map(user, LoginAppDto.class)).collect(Collectors.toList());
		
		return allusers;
	}

}
