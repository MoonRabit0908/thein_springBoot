package com.skc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skc.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
