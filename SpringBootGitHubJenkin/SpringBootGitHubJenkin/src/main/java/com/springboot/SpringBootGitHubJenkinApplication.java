package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGitHubJenkinApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringBootGitHubJenkinApplication.class);

	@GetMapping("/hello")
	public String hello(){
		logger.info("/hello called ");
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitHubJenkinApplication.class, args);
	}

}
