package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The @SpringBootApplication annotation is a convenience annotation that adds:
 * 1. @Configuration: Tags the class as a source of bean definitions.
 * 2. @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings.
 * 3. @ComponentScan: Tells Spring to look for other components, configurations, and services.
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("--------------------------------------");
        System.out.println("  Library API is running on port 8080 ");
        System.out.println("--------------------------------------");
    }
}