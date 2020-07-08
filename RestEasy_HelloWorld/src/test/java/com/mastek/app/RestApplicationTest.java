package com.mastek.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mastek.resources.HelloWorldResource;


public class RestApplicationTest {
	
	static RestApplication resource;
	static Injector injector;
	
	@BeforeAll
	public static void testBeforeAll() {
		injector = Guice.createInjector(new AppInjector());
		resource = injector.getInstance(RestApplication.class);
	}
	
	@Test
	public void testGetSingletons() {
		System.out.println(HelloWorldResource.class);
		assertTrue(resource.getSingletons().size()==1);
		
	}
}
