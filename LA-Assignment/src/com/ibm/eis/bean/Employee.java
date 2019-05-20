package com.ibm.eis.bean;

public class Employee {
	private int id, salary;
	private String name, desgination, inscheme;

	public Employee(int id, String name, String designation, int salary) {
		this.id = id;
		this.name = name;
		this.desgination = designation;

		this.salary = salary;

//		
//		
	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public String getdesgination() {
		return desgination;
	}

	public int getsalary() {
		return salary;
	}

	public String getinscheme() {
		return inscheme;
	}

	public String toString() {
		return "id:" + id + "\n" + "Name :" + name + "\n" + "Designation  :" + desgination + "\n" + "salary :" + salary;

	}

}
