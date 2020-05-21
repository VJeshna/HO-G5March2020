package com.mastek.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/restapi")
public class RestApplication extends Application{
	
	
	    private Set<Object> singletons = new HashSet<Object>();
	    
	    public RestApplication() {
	        singletons.add(new MyResource());
	    }
	    
	    @Override
	    public Set<Object> getSingletons() {
	        return singletons;
	    }
	

}
