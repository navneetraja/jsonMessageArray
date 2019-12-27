package com.rest.mongo.entity;

import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "user-table-mongo-new")
public class Message {
	
	@Id
	private String id;

	@Field
	private JSONObject jsonObj;
	
	
	public JSONObject getJsonObj() {
		return jsonObj;
	}

	public void setJsonObj(JSONObject jsonObj) {
		this.jsonObj = jsonObj;
	}

	
	public Message(JSONObject jsonObj) {
		super();
		this.jsonObj = jsonObj;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	

}
