package com.winowicz.CastleSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CastleSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CastleSpringApplication.class, args);
	}

}

