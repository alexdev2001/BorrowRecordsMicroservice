package com.BorrowMicroservice.BorrowMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BorrowMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BorrowMicroserviceApplication.class, args);
	}

}
