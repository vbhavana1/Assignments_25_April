package com.ibm.mra.beans;

public class Account {

	private String accountType;
	private String customerName;
	private double accountBalance;

	public Account(String accountType, String customerName, double accountBalance) {
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		this.customerName = customerName;

	}
	public double  getaccountBalance() {
		return accountBalance;
	}
	public String getaccountType() {
		return accountType;
	}
	public String getcustomerName() {
		return customerName;
	}
	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setaccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setaccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String toString() {
		return "Account Balance is : " +this.getaccountBalance() +" Customer Name is : " +this.getcustomerName()+" Account Type" +this.getaccountType();
	}

}
