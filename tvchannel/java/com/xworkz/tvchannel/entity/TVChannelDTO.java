package com.xworkz.tvchannel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name="tvchanneldb")
@Data

public class TVChannelDTO {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	@NonNull
	private String name;
	@Column(name = "LANGUAGE")
	@NonNull
	private String language;
	@NonNull
	@Column(name = "LAUNCHED_IN")
	
	private int launched_in;

}
