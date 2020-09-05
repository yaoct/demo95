package com.example.demo95;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo95Application {

    public static void main(String[] args) {
        for(String arg:args){
            System.out.println(arg);
        }
        SpringApplication.run(Demo95Application.class, args);
    }

}
