package com.ricoom.api.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;




@Document
public class County {
	@MongoId
	private String id;
	private String name;
	private List<Constituency> constituencies;
	
	
	
	
	
	public County(String name) {
		this.name = name;
	}





	public County(String id, String name, List<Constituency> constituencies) {
		this.id = id;
		this.name = name;
		this.constituencies = constituencies;
	}





	public County() {
	}





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





	public List<Constituency> getConstituencies() {
		return constituencies;
	}





	public void setConstituencies(List<Constituency> constituencies) {
		this.constituencies = constituencies;
	}





	@Override
	public String toString() {
		return "County [id=" + id + ", name=" + name + ", constituencies=" + constituencies + "]";
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		County other = (County) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (constituencies == null) {
			if (other.constituencies != null)
				return false;
		} else if (!constituencies.equals(other.constituencies))
			return false;
		return true;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((constituencies == null) ? 0 : constituencies.hashCode());
		return result;
	}
	
}
