package com.ibm.eis.ui;

import java.util.*;

import com.ibm.dao.DaoclassEmp;
import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeServiceClass;
import com.ibm.eis.service.EmployeeServiceInterface;

public class MainEmp {
	public static void main(String[] args) {
		DaoclassEmp dao = new DaoclassEmp();
		EmployeeServiceClass empservice = new EmployeeServiceClass();
		
		
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("1: Get employee details from user.");
		System.out.println("2: Find the insurance scheme for an employee based on salary and designation.");
		System.out.println("3: Display all the details of an employee.");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:System.out.println(dao.displaydetails());
			
		case 2: System.out.println("Enter the salary :");
		int usersal = sc.nextInt();
		sc.nextLine();
		System.out.println("enter designation");
		String userdesg = sc.nextLine();
		empservice.validations( usersal, userdesg);
		
		
		
			
			
	
			
		
		}

	}

}
