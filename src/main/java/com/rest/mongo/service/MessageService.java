package com.rest.mongo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.mongo.entity.Message;
import com.rest.mongo.repository.MessageRepository;
@Service
public class MessageService {
	
	@Autowired
	private MessageRepository msgRepo;
	
	public Message createMessage(String str) {
		JSONObject jo = new JSONObject(str);
		
//		String d= (String) jo.get("recordedTs");
//		
//		//Date convertion
//		
//		jo.put("recordedTs", date);
		
		Message msg = new Message(jo);
		return msgRepo.save(msg);
	}
	
	public List<String> getAllMessage() {
		List<Message> lstMessage = msgRepo.findAll();
		List<String> lstString = new ArrayList<String>();
		JSONObject jo = null;
		for(Message msg: lstMessage) {
			jo = msg.getJsonObj();
			lstString.add(jo.toString());
			System.out.println(jo.toString());
		}
		System.out.println("");
		return lstString;
	}

}
