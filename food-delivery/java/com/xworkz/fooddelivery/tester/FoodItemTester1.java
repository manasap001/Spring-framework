package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.entity.FoodType;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.FoodItemServiceImpl;

public class FoodItemTester1 {
	public static void main(String args[]) {
		FoodItemEntity entity=new FoodItemEntity("icecream",50,FoodType.dessert,03,10);
		FoodItemRepository itemRepository=new FoodItemRepositoryImpl();
		FoodItemService foodItemService=new FoodItemServiceImpl(itemRepository);
		foodItemService.saveAndValidate(entity);
	}

}
