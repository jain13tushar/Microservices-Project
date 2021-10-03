package com.microservice.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication

// @EnableEurekaServer is an application that holds the information about all client-service applications.
// Every Micro service will register into the Eureka server and Eureka server
// knows all the client applications running on each port and IP address.
// Eureka Server is also known as Discovery Server.
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
