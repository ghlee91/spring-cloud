package com.example.servicespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSpringApplication.class, args);
    }

}
