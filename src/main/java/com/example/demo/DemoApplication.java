package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
		for(int i=0; i<100; i++) {
			new RedisExample().execute(i);
		}

		
		
		
//		new RedissonExample().execute();
	}

}
