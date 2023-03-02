package com.devdan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdan.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
