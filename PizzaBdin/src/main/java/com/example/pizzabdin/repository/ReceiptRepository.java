package com.example.pizzabdin.repository;

import com.example.pizzabdin.domain.entity.Product;
import com.example.pizzabdin.domain.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, UUID> {
    Optional<Receipt> findByProduct(Product product);
}
