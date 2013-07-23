package com.karmanov.rss.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ChannelRowMapper implements RowMapper<Channel> {

	public Channel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Channel channel = new Channel();
		channel.setId(rs.getString("id"));
		channel.setName(rs.getString("name"));
		return channel;
	}

}
