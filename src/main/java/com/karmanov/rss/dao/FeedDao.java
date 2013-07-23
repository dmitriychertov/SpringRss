package com.karmanov.rss.dao;

public interface FeedDao {
	
	public void getTopNews();
	
	public void getNewsByChannelId(String channelId);
	
	public void updateNewsRank(); 

}
