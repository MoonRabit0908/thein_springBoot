package com.moonrabit.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moonrabit.demo.dto.Member;
import com.moonrabit.demo.mapper.MyMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyService {
	
	private final MyMapper myMapper;
	
	public List<Member> selectMember() {
		return myMapper.selectMember();
	}
}
