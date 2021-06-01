package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantSpringbootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantSpringbootApplication.class, args);
	}
	@Override protected SpringApplicationBuilder configure(SpringApplicationBuilder application) { 
		return application.sources(RestaurantSpringbootApplication.class); }

}
