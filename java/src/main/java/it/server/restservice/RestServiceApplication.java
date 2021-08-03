package it.server.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.server.model.Message;
import it.server.model.Messages;

@SpringBootApplication
public class RestServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}
}
