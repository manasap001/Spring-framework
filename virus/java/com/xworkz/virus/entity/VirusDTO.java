package com.xworkz.virus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name="virusdb")
@Data

public class VirusDTO {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	@NonNull
	private String name;
	@Column(name = "YEAR")
	@NonNull
	private int year;
	@NonNull
	@Column(name = "FAMILY")
	
	private String family;
}
