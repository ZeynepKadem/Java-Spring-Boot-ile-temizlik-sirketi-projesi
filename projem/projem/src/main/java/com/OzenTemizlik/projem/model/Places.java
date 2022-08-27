package com.OzenTemizlik.projem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="places")

public class Places {

    @Id 
    @Column(name="employe_id",nullable=false)
	
	Long employe_id;
    
    @Column(name="user_id",nullable=false)
	Long user_id;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	@JsonIgnore
	@JsonManagedReference
	
	User user;
	
	@Column(name="home",nullable=false)
	String home;
	
	@Column(name="stairway",nullable=false)
	String stairway;
	
	@Column(name="apartment",nullable=false)
	String apartment;
}
