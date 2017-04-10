package com.ms.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Services {
	@RequestMapping("/greeting")
    public String greeting() {
        return "greeting from EurekaClient!";
    }
	
	@RequestMapping("/hello")
    public String hello() {
        return "Hello from EurekaClient!";
    }
}
