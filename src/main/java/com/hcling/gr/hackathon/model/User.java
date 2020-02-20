package com.hcling.gr.hackathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The type User.
 */
@Entity(name="USER")
public class User {

    /**
     * Instantiates a new User.
     */
    public User() {
		super();
	}

    /**
     * Instantiates a new User.
     *
     * @param userID     the user id
     * @param name       the name
     * @param role       the role
     * @param login_name the login name
     * @param login_pwd  the login pwd
     */
    public User(long userID, String name, String role, String login_name, String login_pwd) {
		super();
		this.userID = userID;
		this.name = name;
		this.role = role;
		this.loginName = login_name;
		this.login_pwd = login_pwd;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public long getUserID() {
		return userID;
	}

    /**
     * Sets user id.
     *
     * @param userID the user id
     */
    public void setUserID(long userID) {
		this.userID = userID;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets role.
     *
     * @return the role
     */
    public String getRole() {
		return role;
	}

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(String role) {
		this.role = role;
	}

    /**
     * Gets login name.
     *
     * @return the login name
     */
    public String getLogin_name() {
		return loginName;
	}

    /**
     * Sets login name.
     *
     * @param login_name the login name
     */
    public void setLogin_name(String login_name) {
		this.loginName = login_name;
	}

    /**
     * Gets login pwd.
     *
     * @return the login pwd
     */
    public String getLogin_pwd() {
		return login_pwd;
	}

    /**
     * Sets login pwd.
     *
     * @param login_pwd the login pwd
     */
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
