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

public class FoodItemTester {

	public static void main(String[] args) {
		FoodItemEntity entity=new FoodItemEntity("icecream",50,FoodType.dessert,03,10);
		FoodItemRepository itemRepository=new FoodItemRepositoryImpl();
		itemRepository.save(entity);
		
		CustomerEntity entity1=new CustomerEntity("manasa","mysore",2,1234569874,BillPay.cash);
		CustomerRepository customerRepository=new CustomerRepositoryImpl();
		customerRepository.save(entity1);
		
		HotelVendorEntity entity2=new HotelVendorEntity("teresa","bangalore",3,VendorType.zomato);
		HotelVendorRepository vendorRepository=new HotelVendorRepositoryImpl();
		vendorRepository.save(entity2);


	}

}
