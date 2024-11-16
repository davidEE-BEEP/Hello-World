package com.example.simplewebapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleWebController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloToName(@PathVariable String name) {
        return "Hello " + name;
    }
}
