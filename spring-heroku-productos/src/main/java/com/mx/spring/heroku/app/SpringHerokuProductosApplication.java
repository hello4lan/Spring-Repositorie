package com.mx.spring.heroku.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringHerokuProductosApplication {

	@GetMapping("/sayHello")
	public String sayHello() {
		return "hello from heroku server";
	}
	
	@GetMapping("/say/{name}")
	public String sayHelloSomeOne(@PathVariable String name) {
		
		return "Hello".concat(name);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHerokuProductosApplication.class, args);
	}

}
