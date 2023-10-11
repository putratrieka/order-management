package com.trieka.ordermanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trieka.ordermanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
