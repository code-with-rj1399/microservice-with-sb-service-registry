package com.microservices_with_sb.microservice_with_sb_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceWithSbServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceWithSbServiceRegistryApplication.class, args);
	}

}
