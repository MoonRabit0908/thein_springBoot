package com.moonrabit.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moonrabit.demo.dto.BoardDTO;
import com.moonrabit.demo.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardRepository boardRepository;
	
	public void save(BoardDTO dto) {
		boardRepository.save(dto);
	}
	
	public List<BoardDTO> findAll() {
		return boardRepository.findAll();
	}
}
