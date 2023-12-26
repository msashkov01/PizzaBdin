package com.example.pizzabdin.repository;

import com.example.pizzabdin.domain.entity.Token;
import com.example.pizzabdin.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TokenRepository extends JpaRepository<Token, UUID> {
    Optional<Token> findByToken(String token);
    Optional<Token> findByUser(User user);
}
