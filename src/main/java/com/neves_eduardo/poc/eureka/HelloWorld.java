package com.neves_eduardo.poc.eureka;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public ResponseEntity helloWorld() {return ResponseEntity.ok("Hello World");}
}
