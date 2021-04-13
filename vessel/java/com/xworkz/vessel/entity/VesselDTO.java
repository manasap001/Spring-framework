package com.xworkz.vessel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name ="vesseldb")
@Data

public class VesselDTO {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "V_CLASS")
	@NonNull
	private String v_class;
	@Column(name = "V_TYPE")
	@NonNull
	private String v_type;
	@NonNull
	@Column(name = "SHIPS")
	
	private String ships;
	
	

}
