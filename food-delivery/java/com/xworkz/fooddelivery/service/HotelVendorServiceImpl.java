package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService {
	private HotelVendorRepository hotelVendorRepository;
	public HotelVendorServiceImpl(HotelVendorRepository hotelVendorRepository) {
		System.out.println("invoked "+this.getClass().getSimpleName());
		this.hotelVendorRepository=hotelVendorRepository;
		
	}

	@Override
	public boolean saveAndValidate(HotelVendorEntity entity) {
		System.out.println("invoked saveAndValidate: "+entity);
		if(entity!=null) {
			System.out.println("entity is valid");
			hotelVendorRepository.save(entity);
			
		}
		else
		{
			System.out.println("entity is not valid");
		}
		return false;
	}

}
