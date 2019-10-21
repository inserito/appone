package com.ms.appone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class ApponeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApponeApplication.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAll() {
		return "Hello App One";
	}
}
