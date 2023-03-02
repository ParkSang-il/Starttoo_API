package com.example.tattoogram.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello, Spring Boot!testddd";
    }

    @RequestMapping("/test")
    public String testing(){
        return "Test by K";
    }
}
