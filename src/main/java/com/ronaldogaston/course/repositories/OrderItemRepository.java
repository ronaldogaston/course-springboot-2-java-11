package com.ronaldogaston.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldogaston.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
