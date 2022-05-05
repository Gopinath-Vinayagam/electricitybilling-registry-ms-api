package com.electricitybilling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ElectricitybillingRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricitybillingRegistryMsApiApplication.class, args);
	}

}
