/**
 * 
 * Assignment 4
 * @author Aidin Parsiani
 * @author Kim Yiayong
 * @version 1
 * 
 * 
 **/
package com.assignment_4.subclasses;

import java.util.*;
import com.assignment_4.superclasses.*;

public class PersonalAccount extends BankAccount {

	/** setting random account number */
	public PersonalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal Account");
	}

}
