package com.devdan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdan.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
