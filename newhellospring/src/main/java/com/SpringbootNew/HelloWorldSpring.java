package com.SpringbootNew;
import org.springframework.boot.SpringApplication;
import  org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class HelloWorldSpring {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpring.class, args);
        System.out.println(" I am running springboot!");
    }
}
