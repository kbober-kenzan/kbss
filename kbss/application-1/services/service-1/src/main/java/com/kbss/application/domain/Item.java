package com.kbss.application.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@Entity
@Table(name = "item")
public class Item extends DomainBase {
	
	private static final long serialVersionUID = 8221810041462174538L;
	
	@JsonProperty(value="Poop")
	private String name;
	
	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(
                this.name, 
                this.desc);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof Item)) {
            return false;
        }

		Item that = (Item) obj;
        return Objects.equal(this.name, that.name)
                && Objects.equal(this.desc, that.desc);
	}	 
	
	/*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", this.name)
                .add("desc", this.desc)
                .toString();
    }

}
