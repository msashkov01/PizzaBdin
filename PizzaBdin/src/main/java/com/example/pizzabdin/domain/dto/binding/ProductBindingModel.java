package com.example.pizzabdin.domain.dto.binding;

import com.example.pizzabdin.domain.entity.Category;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class ProductBindingModel {

    private UUID id;

    @NotNull(message = "Name cannot be null")
    @Size(min = 3,max = 32, message = "Name must be more than 3 and less than 32 characters")
    private String name;

    @NotEmpty(message = "Description cannot be blank")
    @Size(min = 10, max = 1024, message = "Description length must be more than 10 and less than 1024 characters")
    private String description;

    @NotNull(message = "Price cannot be null")
    @DecimalMin(value = "0.00", inclusive = false)
    private BigDecimal price;

    @NotNull
    private Boolean activity;

    @NotNull(message = "Category cannot be null")
    private Category category;

    @NotNull(message = "Receipt cannot be null")
    private ReceiptBindingModel receipt;
}
