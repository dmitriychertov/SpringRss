package com.karmanov.rss.controller;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.karmanov.rss.dao.ChannelDaoImpl;
import com.karmanov.rss.model.Channel;

/**
 * 
 * @author Dmitriy.Chertov
 * 
 */

@Component
@Path("/top")
public class RssController {
	
	Logger logger = Logger.getLogger(RssController.class);
	
	@Autowired
	ChannelDaoImpl channelDao;
	

	/**
	 * 
	 * @return
	 */
	@GET
	@Path("/channels")
	@Produces(MediaType.APPLICATION_XML)
	public Channel getChannelByName() {
		logger.info("getAllChannels() request received....");
		return channelDao.getChannelByName("dzone");
	}
	
	/**
	 * 
	 * @return
	 */
	@GET
	@Path("/allchannels")
	@Produces(MediaType.APPLICATION_XML)
	public List<Channel> findAllChannels() {
		logger.info("findAllChannels() request received....");
		return channelDao.findAllChannels();
	}
	
	/**
	 * 
	 * @param info
	 * @return
	 */
	@GET
	@Path("/news")
	public Response getNews(@Context UriInfo info) {
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
		return Response.status(200)
				.entity("News with id: " + id + " rank insreased").build();
	}

}
