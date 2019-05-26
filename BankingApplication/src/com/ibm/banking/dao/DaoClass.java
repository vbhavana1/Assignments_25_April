package com.ibm.banking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoClass {
	Connection dbCon;
	PreparedStatement statement;

	public DaoClass() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/walletdb", "root", "");
		}

		catch (ClassNotFoundException | SQLException e) {
			System.out.println(" Maintaince going on connecting to database ");

		}

	}

	public void createAccount(String customer_name, int acc_no, int balance) {
		try {
			statement = dbCon.prepareStatement("insert into CustomerDetails values (?,?,?)");
			statement.setString(1, customer_name);
			statement.setInt(2, acc_no);
			statement.setInt(3, balance);

			if (statement.executeUpdate() > 0) {
				System.out.println("Account created Successfully");

			}
		} catch (SQLException e) {
			System.out.println("Some issues while inserting data into database " + e);
		}

	}

	public int viewBalance(int acc_check) {
		int balance = 0;
		try {
			statement = dbCon.prepareStatement("select balance from CustomerDetails where acc_no = ?");
			statement.setInt(1, acc_check);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				balance = rs.getInt("balance");
			}

		} catch (SQLException e) {

			System.out.println("some issues " + e);
		}
		return balance;
	}

	public boolean depositAmount(int acc_check, int amount) {
		int balance = getBalance(acc_check) + amount;
		try {
			statement = dbCon.prepareStatement("update CustomerDetails set balance = ? where acc_no = ?");
			statement.setInt(1, balance);
			statement.setInt(2, acc_check);
			if (statement.executeUpdate() > 0) {

				return true;
			} else
				return false;

		} catch (SQLException e) {
			System.out.println("Some issue while depositing account " + e);
		}
		return false;
	}

	private int getBalance(int acc_check) {

		int balance = 0;
		String getBalance = "select * from CustomerDetails where acc_no = ?";
		try {
			statement = dbCon.prepareStatement(getBalance);
			statement.setInt(1, acc_check);
			ResultSet rs = statement.executeQuery();
			if (rs.next())
				balance = rs.getInt("balance");

		} catch (Exception e) {
			System.out.println(e);
		}
		return balance;
	}

	public boolean withdrawAmount(int acc_check, int amount) {
		int balance = getBalance(acc_check);
		if (balance - amount < 0) {
			System.out.println("Amount is not Sufficent");
			return false;
		} else {
			balance = balance - amount;
			try {
				statement = dbCon.prepareStatement("update CustomerDetails set balance = ? where acc_no = ?");
				statement.setInt(1, balance);
				statement.setInt(2, acc_check);
				if (statement.executeUpdate() > 0) {

					return true;
				} else
					return false;

			} catch (SQLException e) {
				System.out.println("Some issue while withdrawing amount " + e);
			}
		}
		return false;
	}

	public boolean fundTransfer(int fromAccNum, int toAccNum, int amount) {
		if (withdrawAmount(fromAccNum, amount)) {
			if (depositAmount(toAccNum, amount)) {
				return true;
			}
			return true;
		}
		return false;
	}

	public boolean validateId(int acc_no) {
		try {
			statement = dbCon.prepareStatement("select acc_no from CustomerDetails");
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				if (rs.getInt("acc_no") == acc_no)
					return false;

			}

		} catch (SQLException e) {
			System.out.println("Issues while retriving account numbers " + e);
		}

		return true;

	}

	public boolean validateAccountNumber(int acc_check) {

		try {
			statement = dbCon.prepareStatement("select acc_no from customerdetails");
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				if (rs.getInt("acc_no") == acc_check)
					return false;

			}

		} catch (SQLException e) {
			System.out.println("Issues while retriving account numbers " + e);
		}
		return true;
	}

}
