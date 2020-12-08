package com.ronaldogaston.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldogaston.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
