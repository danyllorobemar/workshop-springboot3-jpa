package com.devdan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdan.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
