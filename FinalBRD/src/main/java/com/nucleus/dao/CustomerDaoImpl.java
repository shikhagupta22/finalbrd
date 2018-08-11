package com.nucleus.dao;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nucleus.entity.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired 
	SessionFactory sessionFactory;
	
	@Override
	public boolean validId(int code) 
	{
		Customer customer=(Customer) sessionFactory.getCurrentSession().get(com.nucleus.entity.Customer.class, code);
		if(customer!=null)
		{
		return true;
		}
		return false;
	}

	@Override
	public Customer selectToUpdate(int code) 
	{
		Customer customer=(Customer) sessionFactory.getCurrentSession().get(com.nucleus.entity.Customer.class, code);
		return customer;
		
	}

	@Override
	public void updateCustomer(Customer customer) 
	{
	
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
		
	}

	@Override
	public Customer viewById(int code) 
	{
		Customer customer=(Customer) sessionFactory.getCurrentSession().get(com.nucleus.entity.Customer.class, code);
		return customer;
	}

	@Override
	public List<Customer> viewAll() 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("from Customer");
		List<Customer> customer=query.list();
		return customer;
		
	}

	@Override
	public void delete(int code) 
	{
		Customer customer=(Customer) sessionFactory.getCurrentSession().get(com.nucleus.entity.Customer.class, code);
		sessionFactory.getCurrentSession().delete(customer);
	}

	@Override
	public void insert(Customer customer) 
	{
		
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		customer.setRegistrationDate(formatter.format(date));
		sessionFactory.getCurrentSession().save(customer);
	}

}
