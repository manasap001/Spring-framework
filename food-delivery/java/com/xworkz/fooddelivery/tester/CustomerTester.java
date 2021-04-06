package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.entity.BillPay;
import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;
import com.xworkz.fooddelivery.repository.CustomerRepositoryImpl;

public class CustomerTester {

	public static void main(String[] args) {
		CustomerEntity entity=new CustomerEntity("manasa","mysore",2,1234569874,BillPay.cash);
		CustomerRepository customerRepository=new CustomerRepositoryImpl();
		customerRepository.save(entity);

	}

}
