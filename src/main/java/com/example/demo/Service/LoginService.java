package com.example.demo.Service;

import org.springframework.stereotype.Service;



@Service
public interface LoginService {
	
	public int register(String username,String password, String name);

}
