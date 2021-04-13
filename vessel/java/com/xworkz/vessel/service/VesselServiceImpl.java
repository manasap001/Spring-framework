package com.xworkz.vessel.service;

import com.xworkz.vessel.entity.VesselDTO;
import com.xworkz.vessel.repository.VesselRepositoryImpl;

public class VesselServiceImpl implements VesselService {
	public VesselRepositoryImpl vesselRepositoryImpls;
	public VesselServiceImpl(VesselRepositoryImpl vesselRepositoryImpls) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.vesselRepositoryImpls=vesselRepositoryImpls;
	}

	@Override
	public boolean saveAndValidate(VesselDTO dto) {
		System.out.println("invoked saveAndValidate method "+dto);
		if(dto!=null) {
			System.out.println("entity is valid");
			vesselRepositoryImpls.save(dto);
		}
		else {
			System.out.println("entity is invalid");
		}
		
		return false;
	}


}
