package com.example.demo;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
	@Bean
	public RouteLocator getRoutesLocator(RouteLocatorBuilder rout)
	{
		return rout.routes()
				.route(p->p.path("/admin/**").uri("lb://ADMINSERVICES/admin"))
				.route(p->p.path("/user/**").uri("lb://userservice/user")).build();
	}

}
