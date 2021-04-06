package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.entity.VendorType;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;
import com.xworkz.fooddelivery.repository.HotelVendorRepositoryImpl;
import com.xworkz.fooddelivery.service.HotelVendorService;
import com.xworkz.fooddelivery.service.HotelVendorServiceImpl;

public class VendorTester1 {

	public static void main(String[] args) {
		HotelVendorEntity entity=new HotelVendorEntity("teresa","bangalore",3,VendorType.zomato);
		HotelVendorRepository vendorRepository=new HotelVendorRepositoryImpl();
		HotelVendorService vendorService=new HotelVendorServiceImpl(vendorRepository);
		vendorService.saveAndValidate(entity);

	}

}
