package com.nucleus.controller;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.entity.Customer;
import com.nucleus.service.CustomerService;

@Controller
public class MainController 
{
	@Autowired
	private MessageSource messageSource;
	@Autowired
	CustomerService customerService;
	@RequestMapping(value="/welcomeuser/frame", method=RequestMethod.GET)
	public String frame()
	{
		return "frame";
	}
	@RequestMapping(value="/welcomeuser/new", method=RequestMethod.GET)
	public ModelAndView save()
	{
		String New=this.messageSource.getMessage("dispatcher.New", null, null,null);
		System.out.println(New);
		return new ModelAndView(New,"customer",new Customer());
	}
	@RequestMapping(value="/welcomeuser/update1", method=RequestMethod.GET)
	public ModelAndView update1()
	{
		String Update1=this.messageSource.getMessage("dispatcher.Update1", null, null,null);
		System.out.println(Update1);
		return new ModelAndView(Update1,"customer", new Customer());
	}
	@RequestMapping(value="/welcomeuser/single1", method=RequestMethod.GET)
	public String single1()
	{
		String Single1=this.messageSource.getMessage("dispatcher.Single1",  null, null,null);
		return Single1;
	}
	@RequestMapping(value="/welcomeuser/delete1", method=RequestMethod.GET)
	public String delete()
	{
		String Delete1=this.messageSource.getMessage("dispatcher.Delete1",null, null,null);
		return Delete1;
	}
	@RequestMapping(value="/welcomeuser/new", method=RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult result,Principal p)
	{
		customer.setCreatedBy(p.getName());
		String finalnew=this.messageSource.getMessage("dispatcher.finalnew", null, null,null);
		if(result.hasErrors())
		{
			return new ModelAndView("New","customer",customer);
		}
			customerService.insert(customer);
			return new ModelAndView(finalnew,"customer",customer);
	}
	@RequestMapping(value="/welcomeuser/update", method=RequestMethod.POST)
	public ModelAndView selectCustomer(@RequestParam("code") int code)
	{
		String Update=this.messageSource.getMessage("dispatcher.Update",null, null,null);
		boolean exist=customerService.validId(code);
		if(exist==true)
		{
		Customer customer=(Customer)customerService.selectToUpdate(code);
		return new ModelAndView(Update,"customer",customer);
		}
		else
		{
			return new ModelAndView("deleteerror");
		}
		
	}
	@RequestMapping(value="/welcomeuser/updatedo", method=RequestMethod.POST)
	public ModelAndView updateCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println(result.getAllErrors());
			return new ModelAndView("Update","customer",customer);
		}
		String finalupdate=this.messageSource.getMessage("dispatcher.finalupdate", null, null,null);
		
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		customer.setModifiedDate(formatter.format(date));
		customerService.updateCustomer(customer);
		return new ModelAndView(finalupdate,"customer",customer);
	
		
	}
	@RequestMapping(value="/welcomeuser/viewById",method=RequestMethod.POST)
	public ModelAndView viewById(@RequestParam("code") int code)
	{
		boolean exist=customerService.validId(code);
		if(exist==true)
		{
			String Single=this.messageSource.getMessage("dispatcher.Single",null, null,null);
			Customer customer=customerService.viewbyId(code);
			return new ModelAndView(Single,"customers",customer);
			
		}
		return new ModelAndView("deleteerror");

	}
	@RequestMapping(value="/welcomeuser/viewAll", method=RequestMethod.GET)
	public ModelAndView viewAll()
	{
		String All=this.messageSource.getMessage("dispatcher.All", null, null,null);
		List<Customer> customer=customerService.viewAll();
		return new ModelAndView(All,"customers",customer);
		
	}
	@RequestMapping(value="/welcomeuser/delete",method=RequestMethod.POST)
	public String delete(@RequestParam("code") int code)
	{
		boolean exist=customerService.validId(code);
		if(exist==true)
		{
			String Delete=this.messageSource.getMessage("dispatcher.Delete", null, null,null);
			customerService.delete(code);
			return Delete;
		}
		return "deleteerror";
	}


}
