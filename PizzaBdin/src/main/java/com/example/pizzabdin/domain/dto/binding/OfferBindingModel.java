package com.example.pizzabdin.domain.dto.binding;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class OfferBindingModel {

    private UUID id;

    @NotBlank(message = "Price cannot be blank")
    @DecimalMin(value = "0.00", inclusive = false)
    private float promoPrice;

    @NotBlank(message = "Price cannot be blank")
    @DecimalMin(value = "0.00", inclusive = false)
    private float oldPrice;

    @Future(message = "Please select a date in the future")
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private LocalDateTime validUntil;

    @NotEmpty(message = "There must be more than zero products")
    private List<ProductBindingModel> products;
}
