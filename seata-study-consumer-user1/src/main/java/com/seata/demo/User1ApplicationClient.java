package com.seata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Wtq
 * @date 2019/9/20 - 11:30
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableFeignClients
public class User1ApplicationClient {
    public static void main(String[] args) {
        SpringApplication.run(User1ApplicationClient.class,args);
    }
}
