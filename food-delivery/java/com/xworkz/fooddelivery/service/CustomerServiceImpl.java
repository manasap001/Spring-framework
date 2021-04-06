package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.customerRepository=customerRepository;
	}

	@Override
	public boolean saveAndValidate(CustomerEntity entity) {
		System.out.println("invoked saveAndValidate"+entity);
		if(entity!=null) {
			System.out.println("entity is valid");
			customerRepository.save(entity);
		}
		else
		{
			System.out.println("entity is invalid");
		}
		return false;
	}

}
