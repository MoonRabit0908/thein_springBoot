package com.example.demo.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HelloService {
	public String hello() {
		return "안녕 스프링 부트!";
	}
}
