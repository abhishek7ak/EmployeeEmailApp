package com.greatlearning.employee.email.main;

import java.util.Scanner;

import com.greatlearning.employee.email.model.Employee;
import com.greatlearning.employee.email.service.CredentialService;
import com.greatlearning.employee.email.service.CredetialServiceImpl;

public class Driver {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			CredentialService service = new CredetialServiceImpl();

			Employee emp = new Employee("Abhishek","Jain");
			System.out.println("Please select department from the following");
			System.out.println(" 1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resources");
			System.out.println("4. Legal");
			
			int choice = sc.nextInt();
			String department = null;
			switch(choice) {
			case 1: 
				department = "Technical";
				break;
			case 2: 
				department = "Admin";
				break;
			case 3: 
				department = "Human Resources";
				break;
			case 4: 
				department = "Legal";
				break;
			default:
				System.out.println("Please select valid option");
				break;
			}
			if (department != null) {
				emp.setDepartment(department);
				
			}
			String emailAddress = service.generateEmailAddress(emp);
			emp.setEmailaddress(emailAddress);
			
			String password = service.generatepassword();
			emp.setPassword(password);
			
			service.showCredentials(emp);
		}
		
	}
}
