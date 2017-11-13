/**
 * 
 * Assignment 4
 * @author Aidin Parsiani
 * @author Kim Yiayong
 * @version 1.0
 * 
 * 
 **/

package com.assignment_4.main;

import com.assignment_4.subclasses.*;
import com.assignment_4.superclasses.*;


 class Main {

	public static void main(String[] args) {
		String account = "";

		/** take in information aboutvthe different accounts and print results */
		BankCustomer bc = new BankCustomer("Aidin", 35);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.toString();
		
		/** output results*/
		account = bc.getCustomerAccount().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		/** output results */
		System.out.println("Withdrawning 200.0 to the first account");
		account = bc.getCustomerAccount().get(1).getAccountNumber();
		bc.withdrawMoneyFromAccount(account, 200);
		System.out.println(bc.toString());
		
		/**  output results */
		System.out.println("Depositing 200.0 to the first account");
		account = bc.getCustomerAccount().get(2).getAccountNumber();
		bc.depositToAccount(account, 200);
		System.out.println(bc.toString());
	}

}