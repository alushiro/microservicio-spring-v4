package com.example.testingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingWebApplication {

	public static void main(String[] args) {
		try{
		SpringApplication.run(TestingWebApplication.class, args);
		} catch (Throwable t) {
			//log.error(t);
			System.exit(1);  // Default exit code, 0, indicates success. Non-zero value means failure.
		}
	}
}
