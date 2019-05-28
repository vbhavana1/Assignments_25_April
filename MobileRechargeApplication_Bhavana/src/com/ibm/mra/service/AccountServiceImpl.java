package com.ibm.mra.service;

import com.ibm.mra.beans.Account;
import com.ibm.mra.dao.AccountDaoImpl;

public class AccountServiceImpl {
	AccountDaoImpl dao = new AccountDaoImpl();
	 public Account  getAccountDetails(String mobileNum) {
		return dao.getAccountDetails( mobileNum);
		
	}
	public int rechargeAccount(String mobileno, int rechargeAmount) {
		return dao.rechargeAccount( mobileno,  rechargeAmount);
		
	}

}
