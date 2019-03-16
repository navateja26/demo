package com.example.demo.ServiceImpl;

import org.springframework.stereotype.Repository;

import com.example.demo.Service.LoginService;

@Repository
public class LoginServiceImpl implements LoginService {

	@Override
	public int register(String username, String password, String name) {
		
		return 1;
	}

}
