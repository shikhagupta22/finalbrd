package com.nucleus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.entity.Role;
import com.nucleus.entity.User;
import com.nucleus.service.UserService;

@Controller
public class UserController 
{
	@Autowired
	UserService userService;
	@RequestMapping(value="/welcomeadmin/new", method=RequestMethod.GET)
	public ModelAndView newUser()
	{
		return new ModelAndView("userRegistration","user",new User());
	}
	@RequestMapping(value="/welcomeadmin/new", method=RequestMethod.POST)
	public ModelAndView newUserEnter(@ModelAttribute("user") @Valid User user, BindingResult result)
	{
		
		if(result.hasErrors())
		{
			return new ModelAndView("userRegistration","user",user);
		}
		userService.insert(user);
		return new ModelAndView("userSuccess");
	}

}
