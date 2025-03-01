package com.example.firstspringapp;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    @PostMapping
    public String postHello() {
        return "Hello from BridgeLabz - POST Request";
    }
    @PutMapping
    public String putHello() {
        return "Hello from BridgeLabz - PUT Request";
    }
    @DeleteMapping
    public String deleteHello() {
        return "Hello from BridgeLabz - DELETE Request";
    }
}
