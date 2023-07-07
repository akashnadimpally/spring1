package com.skynet.spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
	}
}

@RestController
class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}