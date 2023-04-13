package com.restapi77.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi77.entity.SchoolEntity;

@Repository
public interface SchoolRepo extends JpaRepository<SchoolEntity, Integer> {

	
	
}
