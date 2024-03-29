package com.ms.appone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/appone")
public class ApponeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApponeApplication.class, args);
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getAll() {
		return "Hello App One";
	}
}
