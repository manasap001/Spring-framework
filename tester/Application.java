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
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
		/*
		 * FoodItemService service=container.getBean(FoodItemService.class);
		 * FoodItemEntity entity=new
		 * FoodItemEntity("chocobarIceCream",60,FoodType.dessert,3,20);
		 * service.saveAndValidate(entity);
		 */
		
		/*
		 * CustomerService service1=container.getBean(CustomerService.class);
		 * CustomerEntity entity1=new
		 * CustomerEntity("madhu","mndya",2,1236547897,BillPay.cash);
		 * service1.saveAndValidate(entity1);
		 */
		
		HotelVendorService service2=container.getBean(HotelVendorService.class);
		HotelVendorEntity entity2=new HotelVendorEntity("CHETHANA","MYSORE",2,VendorType.eventVendor);
		service2.saveAndValidate(entity2);
		


	}

}
