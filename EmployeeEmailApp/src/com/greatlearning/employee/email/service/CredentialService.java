package com.greatlearning.employee.email.service;

import com.greatlearning.employee.email.model.Employee;

public interface CredentialService {

	public String generateEmailAddress(Employee employee);
	public String generatepassword();
	public String showCredentials(Employee employee);
	
}
