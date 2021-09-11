package com.yw.mushmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MushmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MushmallMemberApplication.class, args);
    }

}
