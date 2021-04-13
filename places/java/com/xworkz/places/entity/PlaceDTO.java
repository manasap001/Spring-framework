package com.xworkz.places.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name = "placedb")
@Data

public class PlaceDTO {
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
	@Column(name = "REVIEWS")
	
	private int reviews;
	

}
