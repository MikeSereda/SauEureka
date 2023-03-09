package ru.sereda.saueureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SauEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SauEurekaApplication.class, args);
    }

}
