package com.mastek.bankapp.service;

import java.util.Set;

import com.mastek.bankapp.dao.BankAccountDao;
import com.mastek.bankapp.model.BankAccount;

public class BankAccountService {
	
	private BankAccountDao account = new BankAccountDao();
	
	public Set<BankAccount> findAll() {
		return account.findAll();
	}
	
	public BankAccount findById(long id) {
		return account.findById(id);
	}
	
	public boolean add(BankAccount t) {
		return account.add(t);
	}
	
	public boolean delete(BankAccount t) {
		return account.delete(t);
	}
	
	public boolean update(long id, BankAccount t) {
		return account.update(id,t);
	}

}
