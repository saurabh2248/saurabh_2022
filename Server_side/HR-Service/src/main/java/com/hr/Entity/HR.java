package com.hr.Entity;

import java.util.ArrayList;
import java.util.List;

public class HR {
    private Long userID;
    private String userName;
    private String phone;
    private List<Resource> resource = new ArrayList<>();

	public HR(Long userID, String userName, String phone, List<Resource> resource) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.phone = phone;
		this.resource = resource;
	}

	public HR(Long userID, String userName, String phone) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.phone = phone;
	}

	
	public HR() {
		super();
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Resource> getResource() {
		return resource;
	}

	public void setResource(List<Resource> resource) {
		this.resource = resource;
	}
    
	
    
}
