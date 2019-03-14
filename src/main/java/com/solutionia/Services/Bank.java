package com.solutionia.Services;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

@Stateful
@LocalBean
public class Bank implements BankRemote {
	int amount;

	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if (this.amount>=amount) {
			this.amount-=amount;
		}
		else {
			return;
		}
		
	}

	public void deposit(int amount) {
		// TODO Auto-generated method stub
		this.amount+=amount;
		
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return amount;
	}


}
