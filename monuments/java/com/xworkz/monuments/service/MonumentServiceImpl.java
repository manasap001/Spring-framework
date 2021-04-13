package com.xworkz.monuments.service;

import com.xworkz.monuments.entity.MonumentDTO;
import com.xworkz.monuments.repository.MonumentRepositoryImpl;


public class MonumentServiceImpl implements MonumentService {
	public MonumentRepositoryImpl monumentRepositoryImpl;
	public MonumentServiceImpl(MonumentRepositoryImpl monumentRepositoryImpl) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.monumentRepositoryImpl=monumentRepositoryImpl;

	}
	

	@Override
	public boolean saveAndValidate(MonumentDTO dto) {
		System.out.println("invoked MonumentServiceImpl"+dto);
		if(dto!=null) {
			System.out.println("dto is valid");
			monumentRepositoryImpl.save(dto);
		}
		else {
			System.out.println("entity is valid");
		}
		return false;
	}

}
