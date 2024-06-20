package com.edubridge.model;

public class UserInfo 
{
	private Integer userid;
	private String username;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public UserInfo(Integer userid, String username) {
		this.userid = userid;
		this.username = username;
	}
	@Override
	public String toString() {
		return "UserInfo [userid=" + userid + ", username=" + username + "]";
	}
	
	
}
