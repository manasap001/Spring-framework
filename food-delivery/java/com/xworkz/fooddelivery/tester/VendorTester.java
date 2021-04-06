package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.entity.VendorType;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;
import com.xworkz.fooddelivery.repository.HotelVendorRepositoryImpl;

public class VendorTester {

	public static void main(String[] args) {
		HotelVendorEntity entity=new HotelVendorEntity("teresa","bangalore",3,VendorType.zomato);
		HotelVendorRepository vendorRepository=new HotelVendorRepositoryImpl();
		vendorRepository.save(entity);

	}

}
