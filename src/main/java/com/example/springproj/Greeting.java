package com.example.springproj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    @RequestMapping("/")
    String hello(){
        return "Root directory of API. Hello kian.";
    }
}