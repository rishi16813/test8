package com.restapi88.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi88.entity.Staff;
@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer>{

}
