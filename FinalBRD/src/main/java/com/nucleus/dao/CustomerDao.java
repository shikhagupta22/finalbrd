package com.nucleus.dao;

import java.util.List;

import com.nucleus.entity.Customer;

public interface CustomerDao {

	boolean validId(int code);

	Customer selectToUpdate(int code);

	void updateCustomer(Customer customer);

	Customer viewById(int code);

	List<Customer> viewAll();

	void delete(int code);

	void insert(Customer customer);

}
