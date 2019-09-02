package com.nucleus.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//pojo class customer
@Entity
@Table(name="customer1010")
public class Customer {
	@Id
	@Column(length=10)
private String customerCode;
	@Column(length=30,nullable=false)
private String customerName;
	@Column(length=100,nullable=false)
private String customerAddress;
/*private String customerAddress2;*/
	@Column(length=6,nullable=false)
private String customerPinCode;
	@Column(length=100,nullable=false)
private String email;
	@Column(length=20)
private String contactNo;
//private String primaryContactPerson;
//private String recordStatus;
//private String flag;
	@Column(nullable=false)
private Date createDate;
	@Column(nullable=false)
private String createdBy;
private Date modifiedDate;
//private String modifiedBy;
//private Date authorizedDate;
//private String authorizedBy;
public String getCustomerCode() {
	return customerCode;
}
public void setCustomerCode(String customerCode) {
	this.customerCode = customerCode;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
/*public String getCustomerAddress2() {
	return customerAddress2;
}
public void setCustomerAddress2(String customerAddress2) {
	this.customerAddress2 = customerAddress2;
}
*/public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
/*public String getPrimaryContactPerson() {
	return primaryContactPerson;
}
public void setPrimaryContactPerson(String primaryContactPerson) {
	this.primaryContactPerson = primaryContactPerson;
}
public String getRecordStatus() {
	return recordStatus;
}
public void setRecordStatus(String recordStatus) {
	this.recordStatus = recordStatus;
}
public String getFlag() {
	return flag;
}
public void setFlag(String flag) {
	this.flag = flag;
}
*/public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
/*public String getModifiedBy() {
	return modifiedBy;
}
public void setModifiedBy(String modifiedBy) {
	this.modifiedBy = modifiedBy;
}
public String getAuthorizedBy() {
	return authorizedBy;
}
*/public String getCustomerPinCode() {
	return customerPinCode;
}
public void setCustomerPinCode(String customerPinCode) {
	this.customerPinCode = customerPinCode;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}


public Date getCreateDate() {
	return createDate;
}
public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}
public Date getModifiedDate() {
	return modifiedDate;
}
public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
}
/*public Date getAuthorizedDate() {
	return authorizedDate;
}
public void setAuthorizedDate(Date authorizedDate) {
	this.authorizedDate = authorizedDate;
}
public void setAuthorizedBy(String authorizedBy) {
	this.authorizedBy = authorizedBy;
}
*/
@Override
public String toString() {
	return "Customer [customerCode=" + customerCode + ", customerName=" + customerName + ", customerAddress="
			+ customerAddress + ", customerPinCode=" + customerPinCode + ", email=" + email + ", contactNo=" + contactNo
			+ ", createDate=" + createDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate + "]";
}


}