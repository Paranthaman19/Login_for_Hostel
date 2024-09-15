package com.Parama.Registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
public class RegLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegLogApplication.class, args);
		System.out.println("<<< It's Working >>>");
	}

}
