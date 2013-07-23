package com.karmanov.rss.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Channel class using Guava-powered 'common' methods implementations.
 * 
 * I explicitly scope the com.google.common.base.Objects class here to avoid the
 * inherent name collision with the java.util.Objects class.
 * 
 * @author Dmitriy.Chertov
 * 
 */

@XmlRootElement(name = "channel")
public class Channel {

	private String id;

	private String name;

	@XmlAttribute
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Uses Guava to assist in providing hash code of this channel instance.
	 * 
	 * @return My hash code.
	 */
	@Override
	public int hashCode() {
		return com.google.common.base.Objects.hashCode(this.id, this.name);
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
				&& com.google.common.base.Objects.equal(this.name, other.name);
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
				.addValue(this.id).addValue(this.name).toString();
	}
}
