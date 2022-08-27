package com.OzenTemizlik.projem.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class ToDoLists {


	@Id
	@Column(name="id",nullable=false)
	Long id;
	
	
	

	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="user_id",insertable = false, updatable = false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JsonIgnore
	@JsonManagedReference
	ToDoLists toDoList;
	
	@Column(name="user_id",nullable=false)
	Long userId;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JsonIgnore
	@JsonManagedReference
	User user;
	
	@Column(name="employe_id",nullable=false)
	Long employe_id;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="employe_id", insertable = false, updatable = false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JsonIgnore
	@JsonManagedReference
	Employe employe;
	
	
	@Column(name="title",nullable=false)
	String title;
	
	@Lob
	@Column(name="description",nullable=false)
	String description;
	public ToDoLists getToDoList() {
		return toDoList;
	}

	public void setToDoList(ToDoLists toDoList) {
		this.toDoList = toDoList;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getEmploye_id() {
		return employe_id;
	}

	public void setEmploye_id(Long employe_id) {
		this.employe_id = employe_id;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
