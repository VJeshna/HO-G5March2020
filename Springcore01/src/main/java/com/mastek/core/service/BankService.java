package com.mastek.core.service;

import java.util.ArrayList;

import com.mastek.core.model.BankAccount;

public class BankService {
	
	private ArrayList <BankAccount>accounts;

	public ArrayList<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<BankAccount> accounts) {
		this.accounts = accounts;
	}

	
}
