package com.xworkz.application.service;

import com.xworkz.application.entity.ApplicationDTO;

public interface ApplicationService {
	boolean saveAndValidate(ApplicationDTO entity);

}
