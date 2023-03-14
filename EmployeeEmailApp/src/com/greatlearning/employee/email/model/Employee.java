package com.greatlearning.employee.email.model;

public class Employee {
   private String firstName;
   private String lastName;
   private String department;
   private String emailaddress;
   private String password;
 
  public Employee( String firstName, String lastName) {
	  this.firstName = firstName;
	  this.lastName = lastName;
  }
public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getEmailaddress() {
	return emailaddress;
}
public void setEmailaddress(String emailaddress) {
	this.emailaddress = emailaddress;
}
public String getPssword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
