package com.rock.zipkinprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZipkinProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinProviderApplication.class, args);
    }

}
