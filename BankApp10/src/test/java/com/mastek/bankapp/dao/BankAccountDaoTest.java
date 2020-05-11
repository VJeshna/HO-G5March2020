package com.mastek.bankapp.dao;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mastek.bankapp.model.BankAccount;
import com.mastek.bankapp.model.SavingAccount;

class BankAccountDaoTest {

	private BankAccountDao accountDao;

	@BeforeEach
	void beforeEachTest() {
		accountDao = new BankAccountDao();
	}
	
	@Test
	void testFindAll() {
		
		assertNotNull(accountDao.findAll(), "Expected not null ");

	}

	@Test
	void testFindById() {
//		accountDao = new BankAccountDao();
		final long id = 1001;
		assertNotNull(accountDao.findById(id), "Expected not null ");

	}

	@Test
	void testFindByIdForNull() {
//		accountDao = new BankAccountDao();
		final long id = 1;
		assertNull(accountDao.findById(id), "Expected null ");

	}

	@Test
	void testAddTrue() {
	}

	@Test
	void testUpdateTrue() {
	}

	@Test
	void testDeleteTrue() {
//		accountDao = new BankAccountDao();
		BankAccount account = accountDao.findById(1001);
		assertTrue(accountDao.delete(account), "Must return true");

	}

	@Test
	void testDeleteFalse() {
//		accountDao = new BankAccountDao();
		BankAccount account = new SavingAccount(1, "Arati", 20000);
		assertFalse(accountDao.delete(account),"Must Return False value");
	}

}
