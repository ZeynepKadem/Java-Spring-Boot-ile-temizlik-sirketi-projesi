package com.OzenTemizlik.projem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="user")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	@Column(name="userName",nullable=false)
	private String userName;
	
	@Column(name="password",nullable=false)
	private String password;
	
    public User(Long id, String userName, String password) {
		
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
    
    public User() {
		
	}

	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
		

		
	
}
