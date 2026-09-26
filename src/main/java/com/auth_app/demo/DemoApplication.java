package com.auth_app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/// representational state transfer (REST APIS)
///


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


    @GetMapping("/")
    public String authApp(){
        return "auth_app";

    }
    @GetMapping("/")
public String authApp1(){
return "hello";
}
}

















