package com.boardserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardServerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BoardServerApplication.class);
		
		app.setWebApplicationType(WebApplicationType.SERVLET);
		app.run(args);
		
	}

}
