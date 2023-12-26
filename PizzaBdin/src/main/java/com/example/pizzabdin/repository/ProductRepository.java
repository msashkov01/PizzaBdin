package com.example.pizzabdin.repository;

import com.example.pizzabdin.domain.entity.Category;
import com.example.pizzabdin.domain.entity.Product;
import com.example.pizzabdin.domain.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findAllByCategory(Category category);
    Optional<Product> findByReceipt(Receipt receipt);
}
