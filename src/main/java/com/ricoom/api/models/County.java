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
	
	
	
	
	
	public County() {
		
	}
	public County(String name) {
		this.name = name;
	}
	public County(String name, List<Constituency> constituencies) {
		this.name = name;
		this.constituencies = constituencies;
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
}
