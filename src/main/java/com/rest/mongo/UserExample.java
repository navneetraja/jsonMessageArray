package com.rest.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan 
//(basePackages = { "/rest-mongo-springboot/src/main/resources" })
public class UserExample extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UserExample.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
           return builder.sources(UserExample.class);
    }
	
	
	
	
}
