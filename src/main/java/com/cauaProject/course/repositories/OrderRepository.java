package com.cauaProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauaProject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
