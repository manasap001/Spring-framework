package com.xworkz.vessel.service;

import com.xworkz.vessel.entity.VesselDTO;

public interface VesselService {
	boolean saveAndValidate(VesselDTO dto);

}
