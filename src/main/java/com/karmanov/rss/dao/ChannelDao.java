package com.karmanov.rss.dao;

import java.util.List;

import com.karmanov.rss.model.Channel;

/**
 * 
 * @author Dmitriy.Chertov
 *
 */
public interface ChannelDao {
	
	/**
	 * 
	 */
	public void insert();
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Channel getChannelByName(String name);
	
	public List<Channel> findAllChannels();

}
