package com.example.labaRsoii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LabaRsoiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabaRsoiiApplication.class, args);
	}

}
