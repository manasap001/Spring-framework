package com.xworkz.minerals.service;

import com.xworkz.minerals.entity.MineralDTO;
import com.xworkz.minerals.repository.MineralRepositoryImpl;

public class MineralServiceImpl implements MineralService {
	public MineralRepositoryImpl mineralRepository;
	public MineralServiceImpl(MineralRepositoryImpl mineralRepository) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.mineralRepository=mineralRepository;
	}

	@Override
	public boolean saveAndValidate(MineralDTO dto) {
		System.out.println("invoked mineralServiceImpl"+dto);
		if(dto!=null) {
			System.out.println("dto is valid");
			mineralRepository.save(dto);
		}
		else
		{
			System.out.println("dto is not valid");
		}
		
		return false;
	}

}
