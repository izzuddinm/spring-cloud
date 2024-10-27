package com.izzuddinm.nexusconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NexusConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexusConfigServerApplication.class, args);
	}

}
