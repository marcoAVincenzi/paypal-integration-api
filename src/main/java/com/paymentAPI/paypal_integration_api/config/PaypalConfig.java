package com.paymentAPI.paypal_integration_api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.paypal.base.rest.APIContext;

@Configuration
@PropertySource("classpath:application.yml")
public class PaypalConfig {

	@Value("${paypal.client-id}")
	private String clientId;

	@Value("${paypal.client-secret}")
	private String clientSecret;

	@Value("${paypal.mode}")
	private String mode;

	@Bean
	public APIContext apiContext() {
		return new APIContext(clientId, clientSecret, mode);
	}
}
