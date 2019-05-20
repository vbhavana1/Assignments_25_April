package com.ibm.eis.service;

import java.util.Map;


public  class EmployeeServiceClass  implements EmployeeServiceInterface{

	@Override
	public Map<Integer, Object> displaydetails() {

		return displaydetails();
	}

	public void validations(int usersal, String userdesg) {
		if(usersal >5000 && usersal< 20000 && userdesg.equals("System Associate")) {
			
			System.out.println("Scheme A");
		}
		else if(usersal >= 20000 && usersal <40000 && userdesg.equals("programmer")){
			System.out.println("Scheme B");
		}
		else if (usersal >= 40000 && userdesg.equals("manager")) {
			System.out.println(" Scheme C");
		}
		else {
			System.out.println("No Scheme");
		}
		
	}

	
	
	
	

	
	

}
