package com.OzenTemizlik.projem.requests;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PlateCreateRequest {

	
	Long id;
	Long employe_id;
	Date date;
	Long user_id;
	
	
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public PlateCreateRequest(Long id, Long employe_id, Date date) {
		
		this.id = id;
		this.employe_id = employe_id;
		this.date = date;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
