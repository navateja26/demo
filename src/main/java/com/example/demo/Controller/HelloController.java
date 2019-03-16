package com.example.demo.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
	
    @RequestMapping("/")
    public ModelAndView hello() {
        ModelAndView model = new ModelAndView();
    	
    	model.setViewName("hello");
    	
    	return model;
       
    }
    
    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView model = new ModelAndView();
    	
    	model.setViewName("login");
    	
    	return model;
       
    }
}