package model;

import java.io.Serializable;

public class User implements Serializable{
	private String userId;
	private String password;
	
	public User() {};
	public User(String userId, String password) {
		setUserId(userId);
		setPassword(password);
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
