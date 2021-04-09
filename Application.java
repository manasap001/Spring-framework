package com.xworkz.fooddelivery.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.xworkz.fooddelivery.entity.BillPay;
import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.entity.FoodType;
import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.entity.VendorType;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.HotelVendorService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
	
		
		
		FoodItemService service=container.getBean(FoodItemService.class);
		FoodItemEntity entity=new FoodItemEntity("pizza",120,FoodType.italian,2,10);
		service.saveAndValidate(entity);
		
		CustomerService cService=container.getBean(CustomerService.class);
		CustomerEntity cEntity=new CustomerEntity("nandini","mysore",3,123546987,BillPay.phonepe);
		cService.saveAndValidate(cEntity);
		
		HotelVendorService vService=container.getBean(HotelVendorService.class);
		HotelVendorEntity vEntity=new HotelVendorEntity("sahana","MYSORE",3,VendorType.eventVendor);
		vService.saveAndValidate(vEntity);
		 
		


	}

}
