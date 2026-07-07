package com.moonrabit.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.moonrabit.demo.dto.BoardDTO;
import com.moonrabit.demo.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(BoardDTO boardDTO) {
		System.out.println("-----콘솔 값을 확인하자-----");
		System.out.println("DTO = " + boardDTO);
		return "index";
	}
}
