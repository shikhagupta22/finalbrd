package com.nucleus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController 
{
	@RequestMapping("/")
	public String login()
	{
		System.out.println("LOGIN");
		return "Login";
	}
	@RequestMapping("/welcomeuser")
	public String user()
	{
		return "Menu";
	}
	@RequestMapping("/welcomeadmin")
	public String admin()
	{
		return "admin";
	}
	@RequestMapping("/logout")
	public String logout()
	{
		return "Logout";
	}
    @RequestMapping("/logoutpage")
	public String logoutpage()
	{
	return "Login";
	}
    @RequestMapping("/accessdenied")
	public String accessdenied()
	{
	return "access";
	}
    @RequestMapping("/authFail")
	public String authFail()
	{
	return "authFail";
	}
}
