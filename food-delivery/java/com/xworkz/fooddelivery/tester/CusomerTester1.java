package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.entity.BillPay;
import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;
import com.xworkz.fooddelivery.repository.CustomerRepositoryImpl;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.CustomerServiceImpl;

public class CusomerTester1 {

	public static void main(String[] args) {
		CustomerEntity entity=new CustomerEntity("manasa","mysore",2,1234569874,BillPay.cash);
		CustomerRepository customerRepository=new CustomerRepositoryImpl();
		CustomerService customerService=new CustomerServiceImpl(customerRepository);
		customerService.saveAndValidate(entity);

	}

}
