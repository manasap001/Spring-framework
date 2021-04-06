package com.xworkz.fooddelivery.entity;

public class FoodItemEntity {
	private String name;
	private double price;
	private FoodType foodType;
	private int quantity;
	private double discount;
	
	public FoodItemEntity() {
		System.out.println("invoked"+this.getClass().getSimpleName());

	}
	public FoodItemEntity(String name, double price, FoodType foodType, int quantity, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.foodType = foodType;
		this.quantity = quantity;
		this.discount = discount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public FoodType getFoodType() {
		return foodType;
	}
	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "FoodItemEntity [name=" + name + ", price=" + price + ", foodType=" + foodType + ", quantity=" + quantity
				+ ", discount=" + discount + "]";
	}
	
	

}
