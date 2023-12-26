package com.example.pizzabdin.repository;

import com.example.pizzabdin.domain.entity.Delivery;
import com.example.pizzabdin.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, UUID> {
    List<Delivery> findAllByGuarantor(User guarantor);
}
