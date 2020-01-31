package com.example.noDb.TestingApiWithoutDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.noDb")
public class TestingApiWithoutDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingApiWithoutDbApplication.class, args);
		System.out.println("in main");
	}

}
