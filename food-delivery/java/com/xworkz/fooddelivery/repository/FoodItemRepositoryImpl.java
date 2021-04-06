package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {
	public FoodItemRepositoryImpl() {
		System.out.println("invoked"+this.getClass().getSimpleName());
	}
	

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save FoodItemRepositoryImpl"+entity);
		
		
	}

}
