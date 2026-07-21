package com.skc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skc.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
