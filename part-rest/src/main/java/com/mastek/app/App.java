package com.mastek.app;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		WebTarget target;
		String response;
		Client client = ClientBuilder.newClient();

//		target = client.target("http://localhost:3900/part-rest/webapi/myresource/parts");
//		response = target.request().get(String.class);
//		LOGGER.log(Level.INFO, "RESPONSE " + response);

		Form form = new Form();
		form.param("part_id", "1006")
			.param("part_name", "part-6");

		target = client.target("http://localhost:8080/part-rest/webapi/myresource/part/save");
		
		Future<String> response1 = target.request(MediaType.APPLICATION_FORM_URLENCODED)
				.accept(MediaType.TEXT_PLAIN)
				.buildPost(Entity.form(form)).submit(String.class);
		try {
			LOGGER.log(Level.INFO, "RESPONSE " + response1.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//String s = target.path("1").request(MediaType.APPLICATION_JSON).get(String.class);

//		target = client.target("http://localhost:3900/part-rest/webapi/myresource/part/delete/1006");
//		response = target.request().delete(String.class);
//		LOGGER.log(Level.INFO, "RESPONSE " + response);

		// response.close();
		client.close();
	}

}
