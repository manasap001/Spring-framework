package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;

public class FoodItemServiceImpl implements FoodItemService{
	private FoodItemRepository itemRepository;
	
	public FoodItemServiceImpl(FoodItemRepository itemRepository) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.itemRepository=itemRepository;
	}

	@Override
	public boolean saveAndValidate(FoodItemEntity entity) {
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
