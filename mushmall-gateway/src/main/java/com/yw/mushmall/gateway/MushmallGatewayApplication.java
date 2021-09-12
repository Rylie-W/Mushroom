package com.yw.mushmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MushmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MushmallGatewayApplication.class, args);
    }

}
