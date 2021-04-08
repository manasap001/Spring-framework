package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.entity.BillPay;
import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.entity.FoodType;
import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.entity.VendorType;
import com.xworkz.fooddelivery.repository.CustomerRepository;
import com.xworkz.fooddelivery.repository.CustomerRepositoryImpl;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;
import com.xworkz.fooddelivery.repository.HotelVendorRepositoryImpl;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.CustomerServiceImpl;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.FoodItemServiceImpl;
import com.xworkz.fooddelivery.service.HotelVendorService;
import com.xworkz.fooddelivery.service.HotelVendorServiceImpl;

public class FoodItemTester1 {
	public static void main(String args[]) {
		FoodItemEntity entity=new FoodItemEntity("icecream",50,FoodType.dessert,03,10);
		FoodItemRepository itemRepository=new FoodItemRepositoryImpl();
		FoodItemService foodItemService=new FoodItemServiceImpl(itemRepository);
		foodItemService.saveAndValidate(entity);
		
		CustomerEntity entity1=new CustomerEntity("sahana","mysore",2,1234569874,BillPay.cash);
		CustomerRepository customerRepository=new CustomerRepositoryImpl();
		CustomerService customerService=new CustomerServiceImpl(customerRepository);
		customerService.saveAndValidate(entity1);
		
		HotelVendorEntity entity2=new HotelVendorEntity("madhu","bangalore",3,VendorType.zomato);
		HotelVendorRepository vendorRepository=new HotelVendorRepositoryImpl();
		HotelVendorService vendorService=new HotelVendorServiceImpl(vendorRepository);
		vendorService.saveAndValidate(entity2);

	}

}

