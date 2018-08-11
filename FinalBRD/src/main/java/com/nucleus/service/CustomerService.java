package com.nucleus.service;

import java.util.List;

import com.nucleus.entity.Customer;

public interface CustomerService {

	boolean validId(int code);

	void insert(Customer customer);

	Customer selectToUpdate(int code);

	void updateCustomer(Customer customer);

	Customer viewbyId(int code);

	List<Customer> viewAll();

	void delete(int code);

}
