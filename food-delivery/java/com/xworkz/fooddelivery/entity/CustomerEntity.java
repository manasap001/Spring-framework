package com.xworkz.fooddelivery.entity;

public class CustomerEntity {
	private String name;
	private String location;
	private int rating;
	private long phoneNo;
	private BillPay billPay;
	public CustomerEntity() {
		System.out.println("invoked"+this.getClass().getSimpleName());
	}
	public CustomerEntity(String name, String location, int rating, long phoneNo, BillPay billPay) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
		this.billPay = billPay;
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
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public BillPay getBillPay() {
		return billPay;
	}
	public void setBillPay(BillPay billPay) {
		this.billPay = billPay;
	}
	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", phoneNo=" + phoneNo
				+ ", billPay=" + billPay + "]";
	}
	
	

}
