package com.restapi77.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi77.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
