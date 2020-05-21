package com.mastek.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("simple")
public class MyResource {
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloWorld getIt() {
        HelloWorld hw = new HelloWorld();
        hw.setMessage("Hello World");
        
        return hw;
        
	}

}
