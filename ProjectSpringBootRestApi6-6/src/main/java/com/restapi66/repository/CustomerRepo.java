package com.restapi66.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi66.entity.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
