package rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import rest.entity.EntityAdvert;
import rest.service.ServiceAdvert;

@Path("adverts")
public class ControllerAdvert {

	ServiceAdvert serviceAdvert = new ServiceAdvert();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createAdvert(EntityAdvert advert) {
		if(serviceAdvert.createAdvert(advert)) {
			return Response.status(201).entity("Advert created").build();
		}
		return Response.status(400).entity("Can't create advert with id = " + advert.getAdvertId() + " and user id = " + advert.getAdvertAuthorId()).build();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAdvertById(@PathParam("id") int id) {
		EntityAdvert advert = serviceAdvert.findAdvertById(id);
		if(advert != null) {
			return Response.status(200).entity(advert).build();
		}
		return Response.status(404).entity("Can't find advert with id = " + id).build();
	}

	@DELETE
	@Path("{id}")
	public Response deleteAdvertById(@PathParam("id") int id) {
		if(serviceAdvert.deleteAdvertById(id)) {
			return Response.status(200).entity("Advert deleted").build();
		}
		return Response.status(404).entity("Can't delete advert with id = " + id).build();
	}

}