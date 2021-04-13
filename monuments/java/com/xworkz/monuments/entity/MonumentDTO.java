package com.xworkz.monuments.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name="monumentdb")
@Data

public class MonumentDTO {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	@NonNull
	private String name;
	@Column(name = "BEST_TIME_TO_VISIT")
	@NonNull
	private String best_time_to_visit;
	@NonNull
	@Column(name = "ENTRY_FEE")
	
	private int entry_fee;

}
