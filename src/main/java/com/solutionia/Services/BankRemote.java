package com.solutionia.Services;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
interface BankRemote {
	public void withdraw(int amount);
	public void deposit(int amount);
	public int  getBalance();

}
