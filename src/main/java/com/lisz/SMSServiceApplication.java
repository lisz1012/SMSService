package com.lisz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SMSServiceApplication {

    public static void main( String[] args ) {
        SpringApplication.run(SMSServiceApplication.class, args);
    }
}
