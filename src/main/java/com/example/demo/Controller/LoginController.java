package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping("/loginaction")
	public ModelAndView login(@RequestParam(name="username") String username,
							  @RequestParam(name="password") String password) {
		ModelAndView model = new ModelAndView();
		if(username.equals("nava") && password.equals("vamshi")) {
			model.setViewName("homepage");
		}
		else {
			model.setViewName("login");
		}
		
		return model;
	}

	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView model = new ModelAndView();
		model.setViewName("registerJsp");
		return model;
		
	}
	

	@RequestMapping("/registerAction")
	public ModelAndView registersuccess(@RequestParam(name="username") String username,
										@RequestParam(name="password") String password,
										@RequestParam(name="name") String name) {
		ModelAndView model = new ModelAndView();
		int result = service.register(username, password, name);
		if(result == 1) {
			model.setViewName("registersuccess");
		}
		else {
			model.setViewName("registerJsp");
		}
		return model;
		
	}
}
