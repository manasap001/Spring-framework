package com.xworkz.kabbaditeam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name="kabbaditeamdb")
@Data

public class KabbadiDTO {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "TEAM_NAME")
	@NonNull
	private String team_name;
	@Column(name = "DURATION")
	@NonNull
	private int duration;
	@NonNull
	@Column(name = "SCORE")
	
	private int score;

}
