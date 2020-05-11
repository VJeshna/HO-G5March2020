package com.mastek.spring.bankapp.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mastek.spring.bankapp.model.BankAccount;

/**
 * Unit test for simple App.
 */
public class BankDaoTest {
	private static AnnotationConfigApplicationContext context;
	private static BankAccountDao accountDao;

	@BeforeAll
	static void beforeAll() {
		context = new AnnotationConfigApplicationContext("applicationConfig.xml");
		accountDao = context.getBean(BankAccountDao.class);
	}

	@AfterAll
	static void afterAll() {
		context = null;
		accountDao = null;
	}

	@Test
	public void testFindById() {
		final long id = 1001;
		assertNotNull(accountDao.findById(id), "Expected not null ");

	}

	@Test
	public void testFindAll() {
		assertNotNull(accountDao.findAll(), "Expected not null ");

	}

	@Test
	public void testSave() {

	}

	@Test
	public void testDeleteTrue() {
		BankAccount account = context.getBean(BankAccount.class);
		assertTrue(accountDao.delete(account), "Must return true");

	}

}