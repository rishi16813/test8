package com.restapi77.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi77entity.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
