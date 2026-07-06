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

	//http://localhost:8080/
	//결과 안녕 스프링 부트!
    @GetMapping("/")
    public String hello() {
        return helloService.hello();
    }
    
    //http://localhost:8080/message
    //결과 Component가 만든 메세지 입니다.
    @GetMapping("/message")
    public String message() {
        return messageComponent.getMessage();
    }
}