package com.mastek.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.model.HelloWorld;
import com.mastek.service.HelloWorldService;

@Path("hello")
public class HelloWorldResource {
	
	@Inject
	HelloWorldService hws; 
	
	@GET
	@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public HelloWorld findById(@PathParam("id") int id) {
        return hws.findById(id);
	}
	
	@GET
	@Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
	public List<HelloWorld> findAll() {
		return hws.findAll();
	}

}
