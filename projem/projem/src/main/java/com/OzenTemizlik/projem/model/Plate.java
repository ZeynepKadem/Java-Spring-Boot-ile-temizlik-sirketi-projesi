package com.OzenTemizlik.projem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="plates")
public class Plate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	

	@Column(name="employe_id", nullable=false)
	Long employe_id;

	@Column(name="date", nullable=false)
	Date date;
	
	@Column(name="user_id",nullable=false)
	Long user_id;
	
	
	
	
	public Plate(Long id, Long employe_id, Date date, Long user_id) {
		super();
		this.id = id;
		this.employe_id = employe_id;
		this.date = date;
		this.user_id = user_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Plate(Long id, Long employe_id) {
		
		this.id = id;
		this.employe_id = employe_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmploye_id() {
		return employe_id;
	}

	public void setEmploye_id(Long employe_id) {
		this.employe_id = employe_id;
	}
}
