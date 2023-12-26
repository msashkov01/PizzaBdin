package com.example.pizzabdin.repository;

import com.example.pizzabdin.domain.entity.Product;
import com.example.pizzabdin.domain.entity.Rating;
import com.example.pizzabdin.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface RatingRepository extends JpaRepository<Rating, UUID> {
    Optional<Rating> findByAuthor(User author);
    List<Rating> findAllByProduct(Product product);
}
