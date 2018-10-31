package com.simulator.pay.amazon.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.simulator.pay.amazon.controller"})
public class AmazonPaySimulatorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AmazonPaySimulatorApplication.class, args);
	}
	
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AmazonPaySimulatorApplication.class);
	}
}
