package com.rest.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rest.mongo.entity.Message;

public interface MessageRepository extends MongoRepository<Message, String> {

}
