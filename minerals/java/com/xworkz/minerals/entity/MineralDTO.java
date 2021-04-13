package com.xworkz.minerals.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name="mineraldb")
@Data

public class MineralDTO {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "COLOR")
	@NonNull
	private String color;
	@Column(name = "CRYSTAL_FORM")
	@NonNull
	private String crystal_form;
	@NonNull
	@Column(name = "HARDNESS")
	
	private String hardness;

}
