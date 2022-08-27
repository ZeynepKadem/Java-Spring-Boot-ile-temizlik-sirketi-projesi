package com.OzenTemizlik.projem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "manager")
@Entity
@Data
public class Manager {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

}
