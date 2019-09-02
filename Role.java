package com.nucleus.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;

@Entity
@Table(name="role1010")


public class Role {
	@Id
private String roleid;
private String rolename;
public String getRoleid() {
	return roleid;
}
public void setRoleid(String roleid) {
	this.roleid = roleid;
}
public String getRolename() {
	return rolename;
}
public void setRolename(String rolename) {
	this.rolename = rolename;
}
}
