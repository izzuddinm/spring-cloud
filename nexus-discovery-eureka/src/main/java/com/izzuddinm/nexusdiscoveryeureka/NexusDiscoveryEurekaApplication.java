package com.izzuddinm.nexusdiscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NexusDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexusDiscoveryEurekaApplication.class, args);
	}

}
