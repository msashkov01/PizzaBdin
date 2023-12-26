package com.example.pizzabdin.repository;

import com.example.pizzabdin.domain.entity.Order;
import com.example.pizzabdin.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
    List<Order> findAllByCustomer(User customer);
}
