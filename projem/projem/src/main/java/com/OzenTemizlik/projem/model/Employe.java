package com.OzenTemizlik.projem.model;

import javax.persistence.Column;

import javax.persistence.Entity;


import javax.persistence.Id;

import javax.persistence.Table;


import lombok.Data;

@Entity
@Data
@Table(name="employes")

public class Employe {

	@Id
	@Column(name="employe_id", nullable=false)
    Long employe_id;
	
	@Column(name="user_id",nullable=false)
	Long userId;
	
	@Column(name="manager_id", nullable=false)
	Long managerId;

	
	@Column(name="firstName",nullable=false)
	
	String firstName;
	
	@Column(name="lastName",nullable=false)
	String lastName;
	
	@Column(name="phoneNumber",nullable=false)
	String phoneNumber;
	
	
	public Long getEmploye_id() {
		return employe_id;
	}
	public void setEmploye_id(Long employe_id) {
		this.employe_id = employe_id;
	}

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Long getMangerId() {
		return managerId;
	}
	public void setMangerId(Long managerId) {
		this.managerId=managerId;
	}
	
	
}
