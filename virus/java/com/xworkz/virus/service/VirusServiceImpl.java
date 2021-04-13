package com.xworkz.virus.service;

import com.xworkz.virus.entity.VirusDTO;
import com.xworkz.virus.repository.VirusRepositoryImpl;

public class VirusServiceImpl implements VirusService{
	public VirusRepositoryImpl virusRepositoryImpl;
	public VirusServiceImpl(VirusRepositoryImpl virusRepositoryImpl) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.virusRepositoryImpl=virusRepositoryImpl;
		
	}

	@Override
	public Boolean saveAndValidate(VirusDTO dto) {
		System.out.println("invoked VirusServiceImpl"+dto);
		if(dto!=null) {
			System.out.println("dto is valid");
			virusRepositoryImpl.save(dto);
		}
		else {
			System.out.println("not valid");
		}
		return null;
	}

}
