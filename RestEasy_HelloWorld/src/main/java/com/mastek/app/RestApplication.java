package com.mastek.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mastek.resources.HelloWorldResource;

@ApplicationPath("/restapi")
public class RestApplication extends Application {
	
	Injector injector = Guice.createInjector(new AppInjector());
	HelloWorldResource resource1 = injector.getInstance(HelloWorldResource.class);
	
	private Set<Object> singletons = new HashSet<Object>();
	
	public RestApplication() {
		singletons.add(resource1);
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
