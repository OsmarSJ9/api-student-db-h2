package com.asus.apistudent.dto;


import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.asus.apistudent.annotation.AgeValidation;

public class StudentDto {
	
	private Long id;
	
	@NotNull(message = "User name must not be null")
	@Size(min = 2, message = "User name should have at least 2 characteres")
	private String name;
	
	@NotNull(message = "User lastname must not be null")
	@Size(min = 2, message = "User lastname should have at least 2 characteres")
	private String lastname;
	
	@NotNull(message = "User identity card must not be null")
	@Size(min = 7, message = "User identity card should have at least 8 characteres")
	private String identityCard;
	
	@NotNull
	@AgeValidation(value = 0)
	private Integer age;
	
	public StudentDto() {
	}
	
	public StudentDto(String name, String lastname, String identityCard, Integer age) {
		this.name = name;
		this.lastname = lastname;
		this.identityCard = identityCard;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}
