package com.lordofrings.sdk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import com.lordofrings.sdk.constant.WebConstans;


@Configuration
public class WebClientConnection {
	
	@Bean
	public WebClient apiClient() {
	    return WebClient.builder()
	    		.baseUrl(WebConstans.API_URI)
	    		.defaultHeader("Authorization", WebConstans.API_TOKEN)
	    		.build();
	}

}
