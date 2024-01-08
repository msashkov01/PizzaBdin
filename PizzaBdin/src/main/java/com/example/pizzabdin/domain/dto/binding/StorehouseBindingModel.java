package com.example.pizzabdin.domain.dto.binding;

import com.example.pizzabdin.domain.entity.Ingredient;
import com.example.pizzabdin.domain.entity.IngredientDetail;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public class StorehouseBindingModel {

    private UUID id;

    private List<DeliveryBindingModel> historyOfDeliveries;

    @NotNull(message = "Inventory cannot be null")
    private Map<Ingredient, IngredientDetail> inventory;
}
