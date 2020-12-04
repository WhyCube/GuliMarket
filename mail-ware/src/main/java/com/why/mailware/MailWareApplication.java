package com.why.mailware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MailWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailWareApplication.class, args);
    }

}
