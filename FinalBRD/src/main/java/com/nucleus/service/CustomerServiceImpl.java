package com.nucleus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nucleus.dao.CustomerDao;
import com.nucleus.entity.Customer;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	CustomerDao customerDao;

	@Override
	public boolean validId(int code) {
		boolean exist=customerDao.validId(code);
		return exist;
	}

	@Override
	public void insert(Customer customer) 
	{
		customerDao.insert(customer);
	}
	@Override
	public Customer selectToUpdate(int code) 
	{
		Customer customer=(Customer)customerDao.selectToUpdate(code);
		return customer;
		
	}
	@Override
	public void updateCustomer(Customer customer) 
	{
		customerDao.updateCustomer(customer);	
	}
	@Override
	public Customer viewbyId(int code) 
	{
		Customer customer=(Customer)customerDao.viewById(code);
		return customer;
		
	}
	@Override
	public List<Customer> viewAll() 
	{
		List<Customer> customer=customerDao.viewAll();;
		return customer;
	}
	@Override
	public void delete(int code) 
	{
		customerDao.delete(code);
	
	
	}


}
