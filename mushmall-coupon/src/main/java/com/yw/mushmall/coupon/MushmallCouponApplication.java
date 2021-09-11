package com.yw.mushmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MushmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MushmallCouponApplication.class, args);
    }

}
