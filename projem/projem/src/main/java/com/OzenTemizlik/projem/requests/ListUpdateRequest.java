package com.OzenTemizlik.projem.requests;

import lombok.Data;

@Data
public class ListUpdateRequest {

	String title;
	String description;
	
	
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
