package com.rest.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "user-table-mongo-new")
public class User {

	@Id
	private String id;

	@Field
	private String incomingJsonStr;

	@Field
	private String timeStamp;

	public User() {

	}

	public User(String incomingJsonStr, String timeStamp) {
		super();
		this.incomingJsonStr = incomingJsonStr;
		this.timeStamp = timeStamp;
	}

	public String getIncomingJsonStr() {
		return incomingJsonStr;
	}

	public void setincomingJsonStr(String incomingJsonStr) {
		this.incomingJsonStr = incomingJsonStr;
	}

	public String gettimeStamp() {
		return timeStamp;
	}

	public void settimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
