package com.example.cosulconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CosulconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CosulconsumerApplication.class, args);
    }

}
