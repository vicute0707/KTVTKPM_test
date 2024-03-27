package com.javademo.sevice_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SeviceGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeviceGateWayApplication.class, args);
    }

}
