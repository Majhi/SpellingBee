package com.wordsmith.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
@EnableAutoConfiguration
public class SpellingBeeWordReviewerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpellingBeeWordReviewerApplication.class, args);
	}
}
