package com.karmanov.rss.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.karmanov.rss.model.Channel;
import com.karmanov.rss.model.ChannelRowMapper;

public class ChannelDaoImpl extends JdbcDaoSupport implements ChannelDao {

	public void insert() {
		// TODO Auto-generated method stub
		
	}

	public Channel getChannelByName(String name) {
		String sql = "select * from channel where id = ?";
		Channel channel = getJdbcTemplate().queryForObject(sql, new Object[] {name},new ChannelRowMapper());
		return channel;
	}
	
	@SuppressWarnings("unchecked")
	public List<Channel> findAllChannels() {
		String sql = "select * from channel";
		List<Channel> channels = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Channel.class));
		return channels;
		
	}

}
