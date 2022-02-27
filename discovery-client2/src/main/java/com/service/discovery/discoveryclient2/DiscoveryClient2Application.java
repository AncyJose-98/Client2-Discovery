package com.service.discovery.discoveryclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiscoveryClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClient2Application.class, args);
	}

}
