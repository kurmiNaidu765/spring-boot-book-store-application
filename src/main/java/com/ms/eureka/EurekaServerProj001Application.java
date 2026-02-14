package com.ms.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerProj001Application {

	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServerProj001Application.class, args);
		System.out.println("runing on jenkins");
	}

}
