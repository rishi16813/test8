package com.restapi88.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi88.entity.Hospital;
@Repository
public interface HospitalRepo extends JpaRepository<Hospital, Integer>{

}
