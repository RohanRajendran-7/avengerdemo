package com.avenger.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Avenger {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String speciality;
	private String avatar;
	private int age;
}
