package com.akash.RestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestAppApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(RestAppApplication.class, args);

	}

}
