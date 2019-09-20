package com.seate.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Wtq
 * @date 2019/9/20 - 11:02
 */
@SpringBootApplication
@EnableEurekaClient
public class Bank1ApplicationServer {
    public static void main(String[] args) {
        SpringApplication.run(Bank1ApplicationServer.class,args);
    }
}
