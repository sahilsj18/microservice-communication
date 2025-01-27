package com.HTech.EcomUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcomUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomUserApplication.class, args);
	}

}
