package com.example.tattoogram.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        testing();
        return "Hello, Spring Boot!aaask";
    }

    @RequestMapping("/test")
    public String testing(){
        return "Test by K";
    }
}
