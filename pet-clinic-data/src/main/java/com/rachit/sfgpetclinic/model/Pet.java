package com.rachit.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
	
	private petType petType;
	private Owner owner;
	private LocalDate birthDate;
	private  String name;
	
	
	public petType getPetType() {
		return petType;
	}
	public void setPetType(petType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
