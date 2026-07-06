package com.example.demo.component;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MessageComponent {
	public String getMessage() {
		return "Component가 만든 메세지 입니다.";
	}
}
