package com.example.pizzabdin.domain.dto.binding;

import com.example.pizzabdin.domain.dto.UserServiceModel;
import com.example.pizzabdin.domain.entity.Ingredient;
import com.example.pizzabdin.domain.entity.IngredientDetail;
import com.example.pizzabdin.domain.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public class DeliveryBindingModel {

    private UUID id;

    @NotBlank(message = "The delivery has to be sent to concrete storehouse")
    private StorehouseBindingModel storehouse;

    @NotBlank(message = "The delivery has to have an guarantor")
    private UserServiceModel guarantor;

    @NotBlank(message = "There must be more than zero products in the delivery")
    private Map<Ingredient, IngredientDetail> orders;
}
