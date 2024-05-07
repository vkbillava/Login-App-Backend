package com.vkbillava.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vkbillava.login.entity.LoginApp;

public interface LoginAppRepo extends JpaRepository<LoginApp, Integer> {

}
