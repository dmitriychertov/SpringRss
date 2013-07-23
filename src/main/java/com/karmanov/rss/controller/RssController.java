package com.karmanov.rss.controller;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * 
 * @author Dmitriy.Chertov
 * 
 */

@Path("/top")
public class RssController {

	/**
	 * 
	 * @return
	 */
	@GET
	@Path("/channels")
	public Response getAllChannels() {
		String output = "Returs list of all registered channels";
		return Response.status(200).entity(output).build();
	}

	/**
	 * 
	 * @param info
	 * @return
	 */
	@GET
	@Path("/news")
	public Response getSomeNews(@Context UriInfo info) {
		String channel = info.getQueryParameters().getFirst("channel");
		if (channel != null) {
			return Response
					.status(200)
					.entity("getSomeNews is called, Channel name is: "
							+ channel).build();
		}
		String output = "Returns top 100 news from all channels";
		return Response.status(200).entity(output).build();

	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@PUT
	@Path("/news/{id}")
	public Response updateNewsRank(@PathParam("id") int id) {
		return Response.status(200).entity(
				"News with id: " + id + " rank insreased").build();
	}

}
