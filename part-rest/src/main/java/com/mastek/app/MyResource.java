package com.mastek.app;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	
	PartService service = new PartService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @GET
    @Path("/parts")
    @Produces(MediaType.TEXT_PLAIN)
    public String findAll() {
			return service.findAll().toString();
    }
    
    @GET
    @Path("/part/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String findById(@PathParam("id")long id) {
    	return service.findById(id).toString();
    }
    
    @POST
    @Path("/part/save")
    @Produces(MediaType.TEXT_PLAIN)
    public String save(@FormParam("part_id") int part_id,@FormParam("part_name") String part_name) {
            boolean test=service.save(new Part(part_id,part_name));
            if(test) 
            	return "New part succesfully added";
            else 
            	return "Failed as already in list";
    }
    
    @DELETE
    @Path("/part/delete/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String delete(@PathParam("id") int id) {
            boolean test=service.delete(id);
            if(test) 
            	return "New part succesfully deleted";
            else 
            	return "No such object in list";
    }
    
    @PUT
    @Path("/part/update/{id}/{part_name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String update(@PathParam("id") int id, @PathParam("part_name") String part_name) {
            boolean test=service.update(id, part_name);
            if(test) 
            	return "part succesfully updated "+id;
            else 
            	return "No such object in list";
    }
}
