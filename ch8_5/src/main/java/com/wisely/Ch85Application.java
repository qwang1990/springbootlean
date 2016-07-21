package com.wisely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Ch85Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch85Application.class, args);
	}
}
