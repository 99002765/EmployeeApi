package com.example.employeeapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
BU: "DPC"
emailAddress: "krish.lee@ltts.com"
employeeCode: "E1"
firstName: "Krish"
jobTitle: "Developer"
lastName: "Lee"
phoneNumber: "1234567896"
region: "IND"
userId: "LTTS01"
*/
@Entity
public class Employee {
	@Id
	String userId;
	String employeeCode;
	String firstName;
	String lastName;
	String jobTitle;
	String region;
	@Column(name="BU")
	String BU;
	String emailAddress;
	String phoneNumber;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String userId, String employeeCode, String firstName, String lastName, String jobTitle,
			String region, String bU, String emailAddress, String phoneNumber) {
		super();
		this.userId = userId;
		this.employeeCode = employeeCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.region = region;
		BU = bU;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getBU() {
		return BU;
	}
	public void setBU(String bU) {
		BU = bU;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Employee [userId=" + userId + ", employeeCode=" + employeeCode + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", jobTitle=" + jobTitle + ", region=" + region + ", BU=" + BU
				+ ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + "]";
	}
}
