package com.mastek.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mastek.app.AppInjector;

public class HelloWorldServiceTest{
	
	private static HelloWorldService hws;
	
	@BeforeAll
	public static void testBeforeAll () {
		Injector injector = Guice.createInjector(new AppInjector());
		hws = injector.getInstance(HelloWorldService.class);
	}
	
	@Test
	public void testFindById() {
		final int id = 1;
		assertNotNull(hws.findById(id), "Expected not null ");
	}
	
	@Test
	public void testFindByIdForNull() {
		final int id = 1001;
		assertNull(hws.findById(id),"Expected null");
	}
	
	@Test
	public void testFindAll() {
		assertNotNull(hws.findAll(), "All the messages");
	}
}
