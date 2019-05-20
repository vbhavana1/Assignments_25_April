package com.ibm.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeServiceClass;

public class DaoclassEmp implements DaoInterfaceEmp{
	HashMap<String, String> hmap = new HashMap<>();
	
	{
		
		hmap.put("System Associate", "schemeC");
		hmap.put("Programmer"," schemeB");
		hmap.put("manager", "SchemeA");
		hmap.put(" clerk", "noScheme");
	}
	public String getInsurancescheme(String designation) {
		return hmap.get(designation);
		
	}
	

	
	
	


	public   Map<Integer, Object> displaydetails() {
		Employee emp = new Employee(1, " bhavana", "System Associate", 10000);
		Employee emp1 = new Employee(2, "vyshnavi", "programmer", 30000);
		Employee emp2 = new Employee(3, "shivani", "manager", 50000);
		Employee emp3 = new Employee(4, "sivani", "clerck", 3000);
		
		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		
	map.put(1, emp);
	map.put(2, emp1);
	map.put(3, emp2);
		
	return map;
	}
	

}
