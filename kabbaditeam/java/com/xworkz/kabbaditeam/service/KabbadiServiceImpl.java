package com.xworkz.kabbaditeam.service;

import com.xworkz.kabbaditeam.entity.KabbadiDTO;
import com.xworkz.kabbaditeam.repository.KabbadiRepositoryImpl;

public class KabbadiServiceImpl implements KabbadiService{
	public KabbadiRepositoryImpl  kabbadiRepositoryImpl; 
	public KabbadiServiceImpl(KabbadiRepositoryImpl  kabbadiRepositoryImpl) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.kabbadiRepositoryImpl=kabbadiRepositoryImpl;
	}

	@Override
	public Boolean saveAndValidate(KabbadiDTO dto) {
		System.out.println("invoked kabbadiServiceImpl"+dto);
		if(dto!=null) {
			System.out.println("dto is valid");
			kabbadiRepositoryImpl.save(dto);
		}
		else {
			System.out.println("not valid");
		}
		return false;
	}

}
