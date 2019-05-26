package com.ibm.banking.bean;

public class Customer {
	 private String customer_name;
	 private int acc_no;
	 private int balance;
	 public Customer(String customer_name, int acc_no,int balance ) {
		 this.customer_name = customer_name;
		 this.acc_no = acc_no;
		 this.balance = balance;
	 }

		public int getacc_no() {
			return acc_no;
		}

		public void setacc_no(int acc_no) {
			this.acc_no = acc_no;
		}

		public String getcustomer_name() {
			return customer_name;
		}

		public void setcustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}


}
