package com.cauaProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauaProject.course.entities.OrderItem;
import com.cauaProject.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
