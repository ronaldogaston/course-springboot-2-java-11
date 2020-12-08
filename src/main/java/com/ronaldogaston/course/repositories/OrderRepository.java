package com.ronaldogaston.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldogaston.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
