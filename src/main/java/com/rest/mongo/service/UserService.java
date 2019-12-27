package com.rest.mongo.service;

import java.text.DateFormat; 
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date; 
  

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.mongo.entity.User;
import com.rest.mongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUserInfo() {
		List<User> userList = new ArrayList<User>();
		// User userObj1 = new User("111", "Mongo First");
		// User userObj2 = new User("222", "Mong Second");
		// userList.add(userObj1);
		// userList.add(userObj2);
		userRepository.saveAll(userList);
		return userRepository.findAll();
	}

	public User getUserByUserId(String incomingJsonStr) {
		return userRepository.findById(incomingJsonStr).orElse(null);
	}

	public User updateUserInfo(String incomingJsonStr, User users) {
		User existingincomingJsonStr = userRepository.findById(incomingJsonStr).orElse(null);
		existingincomingJsonStr.setincomingJsonStr(users.getIncomingJsonStr());
		existingincomingJsonStr.settimeStamp(users.gettimeStamp());
		return userRepository.save(existingincomingJsonStr);
	}

	public User createNewUser(User users) {
		User objUser = new User();
		objUser.setincomingJsonStr(users.getIncomingJsonStr());
		String Timestamp=users.gettimeStamp();
		long newTimestamp=Long.parseLong(Timestamp);
       /*long epoch = System.currentTimeMillis()/1000;
	   String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date (epoch*1000));
*/      
		long nTimestamp = System.currentTimeMillis()/1000;
        String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date (newTimestamp*1000));
		objUser.settimeStamp(date);
		return userRepository.save(objUser);
	}

}
