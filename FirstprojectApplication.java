package com.ayush.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstprojectApplication.class, args);
		Alien shinchan = ctx.getBean(Alien.class);
		shinchan.code();
	}

}
