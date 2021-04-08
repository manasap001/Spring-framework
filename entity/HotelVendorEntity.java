package com.xworkz.fooddelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name = "vendor")
@Data

public class HotelVendorEntity {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	@NonNull
	private String name;
	@Column(name = "LOCATION")
	@NonNull
	private String location;
	@NonNull
	@Column(name = "RATING")
	private int rating;
	@NonNull
	@Column(name = "VENDOR_TYPE")
	private  VendorType vendore_type;
	
	
	

	

}
