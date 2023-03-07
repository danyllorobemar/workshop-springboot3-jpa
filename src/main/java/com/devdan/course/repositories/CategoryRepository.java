package com.devdan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdan.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
