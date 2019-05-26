package com.ibm.banking.ui;

import java.util.Scanner;

import com.ibm.banking.bean.Customer;
import com.ibm.banking.service.ServiceClass;

public class Main {
	public static void main(String[] args) {
		ServiceClass service = new ServiceClass();
		Customer customer = null;
		Scanner sc = new Scanner(System.in);
		int quit = 0;
		int userchoice;
		String customer_name = null;
		while (quit == 0) {
			System.out.println("Select the option to perform the activity:");
			System.out.println("1. Create Account \n" + "2. View Balance \n" + "3. Deposit Amount \n"
					+ "4. WithDraw Amount \n" + "5. Fund Transfer \n" + "6. Exit Application");
			userchoice = sc.nextInt();
			sc.nextLine();
			switch (userchoice) {
			case 1:

				System.out.println("Enter your Name:");

//				while (!sc.hasNext("[a-zA-z]*")) {
//					sc.next();
//					System.out.println("Special symbols and Numbers are not allowed");
//					customer_name = sc.nextLine();
//
//				}

				customer_name = sc.nextLine();

				System.out.println("Enter account number :");

				int acc_no = sc.nextInt();
				sc.nextLine();
				boolean validate_id = service.validateId(acc_no);
				if (validate_id) {

					customer = new Customer(customer_name, acc_no, 5000);
					service.createAccount(customer);
				} else {
					System.out.println("Id already exists");
				}

				break;
			case 2:
				while (true) {
					System.out.println("Enter the Account number to check balance:");
					int acc_check = sc.nextInt();
					if (!service.validateAccountNumber(acc_check)) {

						System.out.println("Current balance in your account is :: " + service.viewBalance(acc_check));
					} else
						System.out.println("Sorry! No Record Found");

					break;
				}
				continue;

			case 3:
				while (true) {
					System.out.println("Enter the Account number to depoist amount");
					int acc_check = sc.nextInt();
					if (!service.validateAccountNumber(acc_check)) {
						System.out.println("Enter the Amount");
						int amount = sc.nextInt();
						boolean depoistamount = service.depositAmount(acc_check, amount);
						if (depoistamount) {
							System.out.println("The Amount is Deposited Sucessfully");
							System.out.println("Current balance in your account after deposit is :: "
									+ service.viewBalance(acc_check));
						}
					} else
						System.out.println("Sorry! No Record Found");

					break;
				}
				continue;
			case 4:
				while (true) {
					System.out.println("Enter the Account number to Withdraw amount");
					int acc_check = sc.nextInt();
					if (!service.validateAccountNumber(acc_check)) {
						System.out.println("Enter the Amount");
						int amount = sc.nextInt();
						boolean withdraw = service.withdrawAmount(acc_check, amount);
						if (withdraw) {
							System.out.println("Amount is Sucessfully debited");
							System.out.println(
									"Current balance in your account Withdraw is ::" + service.viewBalance(acc_check));
						}
					} else
						System.out.println("Sorry! No Record Found");

					break;
				}
				continue;
			case 5:
				System.out.println("Enter the  Sender Account number");
				int fromAccNum = sc.nextInt();
				System.out.println("Enter the reciver account number");
				int toAccNum = sc.nextInt();
				System.out.println("Enter the amount to transfer");
				int amount = sc.nextInt();
				boolean transferamount = service.fundTransfer(fromAccNum, toAccNum, amount);
				if (transferamount) {
					System.out.println("Transcation Sucessfull.... ");
				}
				break;
			case 6:
				quit = 1;
				System.out.println("Sucessful logout");

				break;
			}
		}

	}

}
