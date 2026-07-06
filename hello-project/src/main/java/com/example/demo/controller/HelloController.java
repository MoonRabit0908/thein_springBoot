package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.component.MessageComponent;
import com.example.demo.service.HelloService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {
	
	private final HelloService helloService;
	
	private final MessageComponent messageComponent;

    @GetMapping("/")
    public String hello() {
        return helloService.hello();
    }
    
    @GetMapping("/message")
    public String message() {
        return messageComponent.getMessage();
    }
}