package com.karmanov.rss.domain;

/**
 * Feed class using Guava-powered 'common' methods implementations.
 * 
 * I explicitly scope the com.google.common.base.Objects class here to avoid the
 * inherent name collision with the java.util.Objects class.
 * 
 * @author Dmitriy.Chertov
 * 
 */
public class Feed {

	private int id;

	private String link;

	private int rank;

	private Channel channel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	/**
	 * Uses Guava to assist in providing hash code of this feed instance.
	 * 
	 * @return My hash code.
	 */
	@Override
	public int hashCode() {
		return com.google.common.base.Objects.hashCode(this.id, this.link,
				this.rank, this.channel);
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
		final Feed other = (Feed) obj;

		return com.google.common.base.Objects.equal(this.id, other.id)
				&& com.google.common.base.Objects.equal(this.link, other.link)
				&& com.google.common.base.Objects.equal(this.rank, other.rank)
				&& com.google.common.base.Objects.equal(this.channel,
						other.channel);
	}

	/**
	 * Method using Guava to provide String representation of this Feed
	 * instance.
	 * 
	 * @return My String representation.
	 */
	@Override
	public String toString() {
		return com.google.common.base.Objects.toStringHelper(this)
				.addValue(this.id).addValue(this.link).addValue(this.rank)
				.addValue(this.channel).toString();
	}

}
