package com.OzenTemizlik.projem.requests;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class EmployeCreateRequest {

	Long employe_id;
	Long user_id;
	String firstName;
	String lastName;
	String phoneNumber;
	
	public Long getEmploye_id() {
		return employe_id;
	}
	public void setEmploye_id(Long employe_id) {
		this.employe_id = employe_id;
	}
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
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
	
}
