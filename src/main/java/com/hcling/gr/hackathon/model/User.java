package com.hcling.gr.hackathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="USER")
public class User {

public User() {
		super();
	}
public User(long userID, String name, String role, String login_name, String login_pwd) {
		super();
		this.userID = userID;
		this.name = name;
		this.role = role;
		this.loginName = login_name;
		this.login_pwd = login_pwd;
	}
public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLogin_name() {
		return loginName;
	}
	public void setLogin_name(String login_name) {
		this.loginName = login_name;
	}
	public String getLogin_pwd() {
		return login_pwd;
	}
	public void setLogin_pwd(String login_pwd) {
		this.login_pwd = login_pwd;
	}
@Id
@Column(name="UserID")
private long userID;
@Column(name="Name")
private String name;
@Column(name="Role")
private String role;
@Column(name="Login_Name")
private String loginName;
@Column(name="Login_Pwd")
private String login_pwd;
}
