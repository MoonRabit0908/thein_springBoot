package com.moonrabit.demo.service;

import org.springframework.stereotype.Service;

import com.moonrabit.demo.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardRepository boardRepository;
}
