package com.xworkz.shirt.service;

import com.xworkz.shirt.entity.ShirtDTO;
import com.xworkz.shirt.respository.ShirtRepositoryImpl;

public class ShirtServiceImpl implements ShirtService{
	public ShirtRepositoryImpl shirtRepositoryImpl;
	public ShirtServiceImpl(ShirtRepositoryImpl shirtRepositoryImpl) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.shirtRepositoryImpl=shirtRepositoryImpl;
	}

	@Override
	public Boolean saveAndValidate(ShirtDTO dto) {
		System.out.println("invoked ForestServiceImpl"+dto);
		if(dto!=null) {
			System.out.println("dto is valid");
			shirtRepositoryImpl.save(dto);
		}
		else {
			System.out.println("not valid");
		}
		return false;
	}

}
