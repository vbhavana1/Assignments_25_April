package com.ibm.mra.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.ibm.mra.beans.Account;

public class AccountDaoImpl {
	Map<String, Account> accountEntry;

	public AccountDaoImpl() {
		accountEntry = new HashMap<>();
		accountEntry.put("9010210131", new Account("Prepaid", "Vaishali", 200));
		accountEntry.put("9823920123", new Account("Prepaid", "Megha", 453));
		accountEntry.put("9932012345", new Account("Prepaid", "Vikas", 631));
		accountEntry.put("9010210131", new Account("Prepaid", "Anju", 521));
		accountEntry.put("9010210131", new Account("Prepaid", "Tushar", 632));

	}

	public Account getAccountDetails(String mobileNum) {
		 Account acc = accountEntry.get(mobileNum);
		 System.out.println(acc.getaccountBalance());
	
		return null;

	}

	public int rechargeAccount(String mobileno, int rechargeAmount) {

		return 0;
	}

}
