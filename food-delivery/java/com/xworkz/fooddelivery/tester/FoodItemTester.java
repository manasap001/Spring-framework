package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.entity.FoodType;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;

public class FoodItemTester {

	public static void main(String[] args) {
		FoodItemEntity entity=new FoodItemEntity("icecream",50,FoodType.dessert,03,10);
		FoodItemRepository itemRepository=new FoodItemRepositoryImpl();
		itemRepository.save(entity);

	}

}
