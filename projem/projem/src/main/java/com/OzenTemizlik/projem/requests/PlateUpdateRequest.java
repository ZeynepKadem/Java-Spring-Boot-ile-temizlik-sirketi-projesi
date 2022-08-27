package com.OzenTemizlik.projem.requests;

import java.util.Date;

import lombok.Data;

@Data

public class PlateUpdateRequest {

	Long employe_id;
	Date date;
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
