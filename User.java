package com.nucleus.model;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user1010")
public class User {
	@Id
private String userid;
private String password;
private int checkEnable;
@OneToOne
private Role role;
public int getCheckEnable() {
	return checkEnable;
}
public void setCheckEnable(int checkEnable) {
	this.checkEnable = checkEnable;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
}
