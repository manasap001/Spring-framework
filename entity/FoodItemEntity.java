package com.xworkz.fooddelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name = "food_item")
@Data

public class FoodItemEntity {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	@NonNull
	private String name;
	@Column(name = "PRICE")
	@NonNull
	private double price;
	@NonNull
	@Column(name = "FOOD_TYPE")
	private FoodType foodType;
	@NonNull
	@Column(name = "QUANTITY")
	private int quantity;
	@NonNull
	@Column(name = "DISCOUNT")
	private double discount;
}
