package com.cg.discover.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.discover.beans.User;


@Controller
public class LoginController  {
	
	//method -1
	/*
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String login(Model model) {
	   User user = new User();
	   model.addAttribute("user", user);
	   return "login";
	}
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String loginSubmit(@Valid User user, BindingResult bindingResult, Model model) {
	    //check for errors
	    if (bindingResult.hasErrors()) {
	       return "login";
	    }
	    //if there are no errors,navigate to home screen
	    return "home";
	}
	*/
	
	  // method 2 
	@RequestMapping(value = "/login", method = RequestMethod.GET) 
	public String showLogin(@ModelAttribute("user")User user) { 
	    return "login"; 
	}
	
	@RequestMapping("/login")
	public String showHome(@Valid @ModelAttribute("user") User user ,BindingResult result) {
		
		if(result.hasErrors()) {
			//System.out.println("This login Page has errors....");
		 List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError temp: allErrors) {
				System.out.println(temp);
			}
			return "login";
		} else {
		return "home";
	} 
	}
}






