package com.hotel.config.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class HotelConfigServer061123Application {

	public static void main(String[] args) {
		SpringApplication.run(HotelConfigServer061123Application.class, args);
	}

}
