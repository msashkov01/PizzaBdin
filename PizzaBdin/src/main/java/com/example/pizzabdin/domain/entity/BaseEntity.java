package com.example.pizzabdin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Data
public abstract class BaseEntity {
    @Id
    @Column(columnDefinition = "UUID")
    @EqualsAndHashCode.Include
    private UUID id = UUID.randomUUID();

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @PrePersist
    public void setCreationDate() {
        this.createdOn = LocalDateTime.now();
    }
}
