package com.ibm.banking.service;

import com.ibm.banking.bean.Customer;
import com.ibm.banking.dao.DaoClass;

public class ServiceClass {
	DaoClass dao = new DaoClass();



	public void createAccount(Customer customer) {
		int acc_no = customer.getacc_no();
		String customer_name = customer.getcustomer_name();
		int balance = customer.getBalance();
		dao.createAccount(customer_name, acc_no, 1000);

	}



	public int viewBalance(int acc_check) {
		
		return dao.viewBalance(acc_check);
	}



	public boolean depositAmount(int acc_check, int amount) {
		
		return dao.depositAmount(acc_check,amount);
	}



	public boolean withdrawAmount(int acc_check, int amount) {
		
		return dao.withdrawAmount(acc_check,amount);
	}



	public boolean fundTransfer(int fromAccNum, int toAccNum, int amount) {
		
		return dao.fundTransfer( fromAccNum, toAccNum, amount );
	}



	public boolean validateId(int acc_no) {
		return dao.validateId(acc_no);
	}



	public boolean validateacc_check(int acc_check) {
		
		return false;
	}



	public boolean validateAccountNumber(int acc_check) {
		
		return dao.validateAccountNumber(acc_check);
	}



	



	


}
