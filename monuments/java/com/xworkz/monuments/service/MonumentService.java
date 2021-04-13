package com.xworkz.monuments.service;

import com.xworkz.monuments.entity.MonumentDTO;

public interface MonumentService {
	boolean saveAndValidate(MonumentDTO dto);

}
