package com.example.pizzabdin.domain.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class IngredientDetail {
    private int quantity;
    private String measurement;
}
