package com.xworkz.tvchannel.service;

import com.xworkz.tvchannel.entity.TVChannelDTO;
import com.xworkz.tvchannel.repository.TVChannelRepositoryImpl;

public class TVChannelServiceImpl implements TVChannelService {
	public TVChannelRepositoryImpl tvChannelRepositoryImpl;
	public TVChannelServiceImpl(TVChannelRepositoryImpl tvChannelRepositoryImpl) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.tvChannelRepositoryImpl=tvChannelRepositoryImpl;
	}

	@Override
	public Boolean saveAndValidate(TVChannelDTO dto) {
		System.out.println("invoked ForestServiceImpl"+dto);
		if(dto!=null) {
			System.out.println("dto is valid");
		    tvChannelRepositoryImpl.save(dto);
		}
		else {
			System.out.println("not valid");
		}
		return false;
		
	}

}
