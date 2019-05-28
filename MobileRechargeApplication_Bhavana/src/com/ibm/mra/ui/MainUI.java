package com.ibm.mra.ui;

import java.util.Scanner;

import com.ibm.mra.service.AccountServiceImpl;

public class MainUI {

	public static void main(String[] args) {
		AccountServiceImpl service = new AccountServiceImpl();
		Scanner sc = new Scanner(System.in);
		int userchoice;
		int exit = 0;
		while (exit == 0) {
			System.out.println("Select option to perform activities");
			System.out.println("1) Account balance Enquiry \n" + "2) Recharge Account \n" + "3) Exit");

			userchoice = sc.nextInt();
			switch (userchoice) {

			case 1:
				System.out.println("Enter Mobile Number :");
				String mobileNum = sc.nextLine();
				
				
				
				System.out.println("Your Current balance is" + service.getAccountDetails(mobileNum));

				break;

			case 2:
			
			
			
				System.out.println("Enter Mobile Number:");
				String mobileno = sc.nextLine();
				System.out.println("Enter recharge Amount");
				int rechargeAmount = sc.nextInt();
				service.rechargeAccount(mobileno,rechargeAmount );

				break;
			case 3:
				exit = 1;

			}

		}
	}

}
