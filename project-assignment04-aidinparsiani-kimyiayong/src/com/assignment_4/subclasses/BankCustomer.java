/**
 * 
 * Assignment 4
 * @author Aidin Parsiani
 * @author Kim Yiayong
 * @version 1.0
 * 
 * 
 **/

package com.assignment_4.subclasses;

import java.util.ArrayList;

import com.assignment_4.superclasses.*;

public class BankCustomer extends Human {
	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	public BankCustomer(String name, int age) {
		super(name, age);
	}

	public ArrayList<BankAccount> getCustomerAccount() {
		return customerAccounts;
	}

	public void setCustomerAccount(ArrayList<BankAccount> customerAccount) {
		this.customerAccounts = customerAccount;
	}

	public void addAccount(BankAccount bankAccount) {
		this.customerAccounts.add(bankAccount);
	}

	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}

	public void withdrawMoneyFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}

	public String toString() {
		return "Customer: " + getName() + " age " + getAge() + " \n" + customerAccounts.get(0) + "\n"
				+ customerAccounts.get(1) + "\n" + customerAccounts.get(2) + "\n";
	}
}