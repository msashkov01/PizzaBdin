package com.example.pizzabdin.repository;

import com.example.pizzabdin.domain.entity.RoleType;
import com.example.pizzabdin.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUsername(String username);
    List<User> findAllBySurname(String surname);
    Optional<User> findByEmail(String email);
    List<User> findAllByRolesContains(RoleType role);
}
