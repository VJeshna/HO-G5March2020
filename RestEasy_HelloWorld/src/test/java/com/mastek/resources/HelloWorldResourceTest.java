package com.mastek.resources;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mastek.app.AppInjector;

public class HelloWorldResourceTest {
	
	private static HelloWorldResource hwr;
	
	@BeforeAll
	public static void testBeforeAll () {
		Injector injector = Guice.createInjector(new AppInjector());
		hwr = injector.getInstance(HelloWorldResource.class);
	}
	
	@Test
	public void testFindById() {
		assertNotNull(hwr.findById(1),"Expected not null");
	}
	
	@Test
	public void testFindByIdForNull() {
		final int id = 1001;
		assertNull(hwr.findById(id),"Expected null");
	}
	
	@Test
	public void testFindAll() {
		assertNotNull(hwr.findAll(), "All the messages");
	}
}
