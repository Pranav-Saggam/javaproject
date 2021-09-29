package com.ott;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class OttApplication {
    public static void main(String[] args) {
        SpringApplication.run(OttApplication.class, args);
    }
}