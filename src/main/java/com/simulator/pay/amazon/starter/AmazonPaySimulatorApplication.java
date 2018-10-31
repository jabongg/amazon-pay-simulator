package com.simulator.pay.amazon.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.simulator.pay.amazon.controller"})
public class AmazonPaySimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonPaySimulatorApplication.class, args);
	}
	
	public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AmazonPaySimulatorApplication.class);
	}
}
