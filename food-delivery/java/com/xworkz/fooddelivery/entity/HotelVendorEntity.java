package com.xworkz.fooddelivery.entity;

public class HotelVendorEntity {
	private String name;
	private String location;
	private int rating;
	private VendorType vendorType;
	public HotelVendorEntity() {
		System.out.println("invoked "+this.getClass().getSimpleName());
	}
	public HotelVendorEntity(String name, String location, int rating, VendorType vendorType) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.vendorType = vendorType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public VendorType getVendorType() {
		return vendorType;
	}
	public void setVendorType(VendorType vendorType) {
		this.vendorType = vendorType;
	}
	@Override
	public String toString() {
		return "HotelVendorEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", vendorType="
				+ vendorType + "]";
	}
	
	

	

}
