package com.tamil.college_service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamil.college_service.College;

public interface CollegeRepository extends JpaRepository<College, Integer>{

}