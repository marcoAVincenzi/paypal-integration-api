package com.paymentAPI.paypal_integration_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.paymentAPI.paypal_integration_api.config")
public class PaypalIntegrationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaypalIntegrationApiApplication.class, args);
	}

}
