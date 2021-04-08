package com.xworkz.fooddelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name = "customer")
@Data

public class CustomerEntity {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	@NonNull
	private String name;
	@Column(name = "ADDRESS")
	@NonNull
	private String address;
	@NonNull
	@Column(name = "RATING")
	private int rating;
	@NonNull
	@Column(name = "PHONENO")
	private int phoneno;
	@NonNull
	@Column(name = "BILL_PAY")
	private BillPay billpay;
	
	
	

}
