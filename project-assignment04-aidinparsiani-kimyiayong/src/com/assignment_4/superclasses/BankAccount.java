/**
 * 
 * Assignment 4
 * @author Aidin Parsiani
 * @author Kim Yiayong
 * @version 1
 * 
 * 
 **/
package com.assignment_4.superclasses;

import com.assignment_4.interfaces.*;
import java.util.UUID;

public class BankAccount implements BankOperations {

	/** setting attributes */
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;

	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}

	/** getters and setters */
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/** getters and setters */
	public String getAccountType() {
		return accountType;
	}

	/** getters and setters */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/** getters and setters */
	public double getBalance() {
		return balance;
	}

	/** getters and setters */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/** represent object as a string */
	public String toString() {
		return "Bank Account[ Account number " + this.accountNumber + ", Account type " + this.accountType
				+ ", Balance. " + this.balance;
	}

	/** if loop for withdrawing money */
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("You can not withdraw a negative value");
		}

	}

	/** if loop for depositing money */
	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("You can not deposit a value");
		}
	}

}
