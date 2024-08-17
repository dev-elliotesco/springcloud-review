package com.review.ms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReviewMsApplication {

	private static final Logger logger = LoggerFactory.getLogger(ReviewMsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ReviewMsApplication.class, args);
		logger.info("Welcome to Review Microservice!");
	}

}
