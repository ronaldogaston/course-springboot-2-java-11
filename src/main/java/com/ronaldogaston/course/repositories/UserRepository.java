package com.ronaldogaston.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldogaston.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
