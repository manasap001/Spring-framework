package com.xworkz.places.service;

import com.xworkz.places.entity.PlaceDTO;
import com.xworkz.places.repository.PlaceRepositoryImpl;

public class PlaceServiceImpl implements PlaceService {
	public PlaceRepositoryImpl placeRepositoryImpl;
	public PlaceServiceImpl(PlaceRepositoryImpl placeRepositoryImpl) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.placeRepositoryImpl=placeRepositoryImpl;
	}

	@Override
	public boolean saveAndValidate(PlaceDTO dto) {
		System.out.println("invoked saveAndValidate method "+dto);
		if(dto!=null) {
			System.out.println("entity is valid");
			placeRepositoryImpl.save(dto);
		}
		else {
			System.out.println("entity is invalid");
		}
		
		return false;
	}

}
