package com.example.pizzabdin.repository;

import com.example.pizzabdin.domain.entity.Delivery;
import com.example.pizzabdin.domain.entity.Storehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StorehouseRepository extends JpaRepository<Storehouse, UUID> {
    Optional<Storehouse> findByHistoryOfDeliveriesContains(Delivery delivery);
}
