package com.trieka.ordermanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trieka.ordermanagement.entity.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order, String>{

}
