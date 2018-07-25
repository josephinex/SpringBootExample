package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EntityScan("com.app.entity")
@PropertySource("classpath:application.properties")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
