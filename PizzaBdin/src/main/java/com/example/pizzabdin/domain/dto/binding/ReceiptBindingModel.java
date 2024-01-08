package com.example.pizzabdin.domain.dto.binding;

import com.example.pizzabdin.domain.entity.Ingredient;
import com.example.pizzabdin.domain.entity.IngredientDetail;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public class ReceiptBindingModel {

    private UUID id;

    @NotNull(message = "Ingredients cannot be null")
    private Map<Ingredient, IngredientDetail> ingredients;

    @NotNull(message = "Product cannot be null")
    private ProductBindingModel product;
}

