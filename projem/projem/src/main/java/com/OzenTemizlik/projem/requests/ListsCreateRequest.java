package com.OzenTemizlik.projem.requests;

import lombok.Data;

@Data

public class ListsCreateRequest {

	Long list_id;
	Long user_id;
	String title;
	String description;
	Long employe_id;
	
	
	public Long getEmploye_id() {
		return employe_id;
	}
	public void setEmploye_id(Long employe_id) {
		this.employe_id = employe_id;
	}
	public Long getList_id() {
		return list_id;
	}
	public void setList_id(Long list_id) {
		this.list_id = list_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
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
