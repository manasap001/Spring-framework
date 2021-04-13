package com.xworkz.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name = "applicationdb")
@Data
public class ApplicationDTO {
	@Id
	@Column(name = "EMP_ID")
	private int emp_id;
	@Column(name = "NAME")
	@NonNull
	private String name;
	@Column(name = "ADDRESS")
	@NonNull
	private String address;
	@NonNull
	@Column(name = "QUALIFICATION")
	
	private String qualification;
	
	
	
}
