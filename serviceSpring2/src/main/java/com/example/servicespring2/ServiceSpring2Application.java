package com.example.servicespring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceSpring2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSpring2Application.class, args);
    }

}
