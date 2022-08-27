package com.OzenTemizlik.projem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	Long id;
	String userName;
	String password;
	
	public Login(){
		
	}
	
	public Login(Long id, String userName, String password) {
		
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserNmae() {
		return userName;
	}
	public void setUserNmae(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
