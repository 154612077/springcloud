package com.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xzk
 * @date 2019/7/22
 **/
@Configuration
public class GatewayRoutes {
   /* @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r ->
                        r.path("/java*//**")
                                .filters(
                                        f -> f.stripPrefix(1)
                                )
                                .uri("http://localhost:8090/helloWorld")
                )
                .build();
    }*/
}
