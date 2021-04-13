package com.xworkz.shirt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name="shirtdb")
@Data

public class ShirtDTO {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "TYPE")
	@NonNull
	private String type;
	@Column(name = "COLOR")
	@NonNull
	private String color;
	@NonNull
	@Column(name = "COST")
	
	private int cost;
	@NonNull
	@Column(name = "QUANTITY")
	
	private int quantity;


}
