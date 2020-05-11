package com.mastek.bankapp.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mastek.bankapp.model.BankAccount;
import com.mastek.bankapp.model.SavingAccount;

public class BankAccountServiceTest {
	
	private BankAccountService accountService;

	@BeforeEach
	void beforeEachTest() {
		accountService = new BankAccountService();
	}
	
	@Test
	void testFindAll() {
		
		assertNotNull(accountService.findAll(), "Expected not null ");

	}

	@Test
	void testFindById() {
//		accountDao = new BankAccountDao();
		final long id = 1001;
		assertNotNull(accountService.findById(id), "Expected not null ");

	}

	@Test
	void testFindByIdForNull() {
//		accountDao = new BankAccountDao();
		final long id = 1;
		assertNull(accountService.findById(id), "Expected null ");

	}

	@Test
	void testDeleteTrue() {
//		accountDao = new BankAccountDao();
		BankAccount account = accountService.findById(1001);
		assertTrue(accountService.delete(account), "Must return true");

	}

	@Test
	void testDeleteFalse() {
//		accountDao = new BankAccountDao();
		BankAccount account = new SavingAccount(1, "Arati", 20000);
		assertFalse(accountService.delete(account),"Must Return False value");
	}

}
