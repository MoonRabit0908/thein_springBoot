package com.moonrabit.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moonrabit.demo.dto.Member;

@Mapper
public interface MyMapper {
	List<Member> selectMember();
}
