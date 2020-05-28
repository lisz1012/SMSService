package com.lisz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 可设置启动参数：--server.port=9002
@SpringBootApplication
@EnableEurekaClient
public class SMSServiceApplication {

    public static void main( String[] args ) {
        SpringApplication.run(SMSServiceApplication.class, args);
    }
}
