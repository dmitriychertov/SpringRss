package com.karmanov.rss.domain;

import java.util.List;

/**
 * Channel class using Guava-powered 'common' methods implementations.
 * 
 * I explicitly scope the com.google.common.base.Objects class here to avoid the
 * inherent name collision with the java.util.Objects class.
 * 
 * @author Dmitriy.Chertov
 * 
 */
public class Channel {

	private String id;

	private String name;

	private List<Feed> feeds;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Feed> getFeeds() {
		return feeds;
	}

	public void setFeeds(List<Feed> feeds) {
		this.feeds = feeds;
	}

	/**
	 * Uses Guava to assist in providing hash code of this channel instance.
	 * 
	 * @return My hash code.
	 */
	@Override
	public int hashCode() {
		return com.google.common.base.Objects.hashCode(this.id, this.name,
				this.feeds);
	}

	/**
	 * Using Guava to compare provided object to me for equality.
	 * 
	 * @param obj
	 *            Object to be compared to me for equality.
	 * @return {@code true} if provided object is considered equal to me or
	 *         {@code false} if provided object is not considered equal to me.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Channel other = (Channel) obj;

		return com.google.common.base.Objects.equal(this.id, other.id)
				&& com.google.common.base.Objects.equal(this.name, other.name)
				&& com.google.common.base.Objects
						.equal(this.feeds, other.feeds);
	}

	/**
	 * Method using Guava to provide String representation of this Channel
	 * instance.
	 * 
	 * @return My String representation.
	 */
	@Override
	public String toString() {
		return com.google.common.base.Objects.toStringHelper(this)
				.addValue(this.id).addValue(this.name).addValue(this.feeds)
				.toString();
	}
}
