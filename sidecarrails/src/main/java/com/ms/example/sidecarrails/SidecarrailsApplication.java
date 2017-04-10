package com.ms.example.sidecarrails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SidecarrailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidecarrailsApplication.class, args);
	}
}
