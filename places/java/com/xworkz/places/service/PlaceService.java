package com.xworkz.places.service;

import com.xworkz.places.entity.PlaceDTO;

public interface PlaceService {
	boolean saveAndValidate(PlaceDTO dto);
}
