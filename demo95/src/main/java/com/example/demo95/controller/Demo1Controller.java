package com.example.demo95.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {
    @GetMapping("/f1")
    String ff(){
        return "1234333ddddddd";
    }
}
