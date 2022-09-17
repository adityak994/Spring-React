package com.aditya.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aditya.springbackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}