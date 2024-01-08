package com.example.pizzabdin.domain.dto.binding;

import com.example.pizzabdin.domain.dto.UserServiceModel;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.service.annotation.GetExchange;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class OrderBindingModel {

    private UUID id;

    @NotBlank(message = "Price cannot be blank")
    @DecimalMin(value = "0.00", inclusive = false)
    private float totalPrice;

    @NotEmpty(message = "There must be more than zero products")
    private List<ProductBindingModel> products;

    @NotNull(message = "Customer cannot be null")
    private UserServiceModel customer;

    @NotNull(message = "Boolean should be either true or false")
    private Boolean approved;
}
