package com.example.demo.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.student.dto.Student;

@Service
public class StudentService {
	
	
	public List<Student> findAll() {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "홍길동", 20));
		list.add(new Student(2, "이순신", 23));
		list.add(new Student(3, "강감찬", 22));
		
		return list;
	}
}
