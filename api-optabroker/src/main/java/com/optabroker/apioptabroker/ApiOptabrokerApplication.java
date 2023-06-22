package com.optabroker.apioptabroker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiOptabrokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiOptabrokerApplication.class, args);

		System.out.println("Start Openbroker");
	}

}
