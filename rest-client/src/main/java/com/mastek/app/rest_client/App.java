package com.mastek.app.rest_client;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import com.mastek.app.rest_client.Part;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		WebTarget target;
		String response;
		Client client = ClientBuilder.newClient();

//		target = client.target("http://localhost:3900/part-rest/webapi/myresource/parts");
//		response = target.request().get(String.class);
//		LOGGER.log(Level.INFO, "RESPONSE " + response);

        target=client.target("http://localhost:8080/part-rest/webapi/myresource/part/save");
		response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.TEXT_PLAIN_TYPE)
				.post(Entity.json(new Part(1006, "part-6")), String.class);
		LOGGER.log(Level.INFO, "RESPONSE " + response);

//		target = client.target("http://localhost:3900/part-rest/webapi/myresource/part/delete/1006");
//		response = target.request().delete(String.class);
//		LOGGER.log(Level.INFO, "RESPONSE " + response);

		// response.close();
		client.close();
	}

}
