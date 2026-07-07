package com.moonrabit.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moonrabit.demo.dto.Member;
import com.moonrabit.demo.service.MyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MyController {
	
	private final MyService myService;
	
	@GetMapping("/member")
	public List<Member> getMember() {
		List<Member> list = myService.selectMember();
		return list;
	}
}
