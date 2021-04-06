package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {
	public CustomerRepositoryImpl() {
		System.out.println("invoked"+this.getClass().getSimpleName());
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save :  "+entity);
		
	}

}
