package com.example.firstspringapp.controller;
import com.example.firstspringapp.dto.User;
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

    @GetMapping("/query")
    public String sayHelloRequestParam(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

}
