package com.example.pizzabdin.domain.dto.binding;

import com.example.pizzabdin.domain.dto.UserServiceModel;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class RatingBindingModel {

    private UUID id;

    @NotBlank(message = "Rating cannot be blank")
    @DecimalMin(value = "0.00", inclusive = false)
    @DecimalMax(value = "5.00", inclusive = false)
    private float rating;

    @NotNull(message = "Product cannot be null")
    private ProductBindingModel product;

    @NotNull(message = "Author cannot be null")
    private UserServiceModel author;
}
