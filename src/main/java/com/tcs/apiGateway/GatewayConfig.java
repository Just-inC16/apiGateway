package com.tcs.apiGateway;

//@Configuration
//public class GatewayConfig {
//
//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes().route("customer_route", r -> r.path("/customers/**").uri("http://localhost:8081"))
//				.route("order_route", r -> r.path("/orders/**").uri("http://localhost:8082")).build();
//	}
//}