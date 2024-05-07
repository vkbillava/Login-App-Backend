package com.vkbillava.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vkbillava.login.payload.LoginAppDto;
import com.vkbillava.login.service.LoginAppService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class LoginAppController {
	
	@Autowired
	private LoginAppService loginAppService;
	
	@PostMapping("/")
	public ResponseEntity<LoginAppDto> createUser(@Valid @RequestBody LoginAppDto loginAppDto) {
		LoginAppDto createdUser = this.loginAppService.createUser(loginAppDto);
		
		return new ResponseEntity<LoginAppDto>(createdUser, HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<LoginAppDto>> getAllUsers() {
		return ResponseEntity.ok(this.loginAppService.getAllUsers());
	}

}
