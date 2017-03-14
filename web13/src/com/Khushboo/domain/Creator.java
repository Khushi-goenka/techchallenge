package com.Khushboo.domain;

public class Creator {
	int uUid;
	String uEmail;
	String firstName;
	public int getuUid() {
		return uUid;
	}
	public void setuUid(int uUid) {
		this.uUid = uUid;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getOpenId() {
		return openId;
	}
	public void setOpenId(int openId) {
		this.openId = openId;
	}
	int openId;
	

}
