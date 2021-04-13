package com.xworkz.application.service;

import com.xworkz.application.entity.ApplicationDTO;
import com.xworkz.application.repository.ApplicationRepository;

public class ApplicationServiceImpl implements ApplicationService {
private ApplicationRepository itemRepository;
	
	public ApplicationServiceImpl(ApplicationRepository itemRepository) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.itemRepository=itemRepository;
	}

	@Override
	public boolean saveAndValidate(ApplicationDTO entity) {
		System.out.println("invoked saveAndValidate method "+entity);
		if(entity!=null) {
			System.out.println("entity is valid");
			itemRepository.save(entity);
		}
		else {
			System.out.println("entity is invalid");
		}
		
		return false;
	}

}

	


