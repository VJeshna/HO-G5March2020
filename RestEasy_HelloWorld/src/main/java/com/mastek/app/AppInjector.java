package com.mastek.app;

import com.google.inject.AbstractModule;
import com.mastek.service.HelloWorldService;
import com.mastek.service.IService;

public class AppInjector extends AbstractModule {

	@Override
	public void configure() {
		bind(HelloWorldService.class);
		bind(IService.class).to(HelloWorldService.class);
	}

}
