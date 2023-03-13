package com.devdan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdan.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
