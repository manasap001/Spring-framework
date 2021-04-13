package com.xworkz.nationalforest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name="nationalforestdb")
@Data

public class NationalForestDTO {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	@NonNull
	private String name;
	@Column(name = "ESTABLISHED_IN")
	@NonNull
	private int established_in;
	@NonNull
	@Column(name = "LOCATION")
	
	private String location;

}


