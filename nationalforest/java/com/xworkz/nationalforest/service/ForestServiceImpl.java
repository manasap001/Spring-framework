package com.xworkz.nationalforest.service;

import com.xworkz.nationalforest.entity.NationalForestDTO;
import com.xworkz.nationalforest.repository.ForestRepositoryImpl;

public class ForestServiceImpl implements ForestService{
	public ForestRepositoryImpl forestRepositoryImpl;
	public ForestServiceImpl(ForestRepositoryImpl forestRepositoryImpl) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.forestRepositoryImpl=forestRepositoryImpl;
	}

	@Override
	public boolean saveAndValidate(NationalForestDTO dto) {
		System.out.println("invoked ForestServiceImpl"+dto);
		if(dto!=null) {
			System.out.println("dto is valid");
			forestRepositoryImpl.save(dto);
		}
		else {
			System.out.println("not valid");
		}
		return false;
		
	}

}
