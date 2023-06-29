package com.ricoom.api.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Document
public class Constituency {
	@MongoId
	private String id;
	private String name;
	
	
	public Constituency() {
		
	}
	public Constituency(String name) {
		super();
		this.name = name;
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
	@Override
	public String toString() {
		return "Constituency [id=" + id + ", name=" + name + "]";
	}
	
}
