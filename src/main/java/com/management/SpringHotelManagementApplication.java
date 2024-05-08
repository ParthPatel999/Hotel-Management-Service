package com.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringHotelManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelManagementApplication.class, args);
	}

}
