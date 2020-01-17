package rest.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import rest.entity.EntityAdvert;
import rest.entity.EntityUser;
import rest.service.ServiceUser;

@Path("users")
public class ControllerUser {

	ServiceUser serviceUser = new ServiceUser();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(EntityUser user) {
		if(serviceUser.createUser(user)) {
			return Response.status(201).entity("User created").build();
		}
		return Response.status(400).entity("Can't create user with id = " + user.getUserId()).build();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAdvertsByUserId(@PathParam("id") int id) {
		List<EntityAdvert> adverts = serviceUser.findAdvertsByUserId(id);
		if(!adverts.isEmpty()) {
			return Response.status(200).entity(adverts).build();
		}
		return Response.status(404).entity("Can't find adverts with user id = " + id).build();
	}

}