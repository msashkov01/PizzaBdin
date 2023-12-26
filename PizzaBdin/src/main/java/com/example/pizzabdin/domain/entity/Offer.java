package com.example.pizzabdin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "offer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Offer extends BaseEntity {

    @Column(name = "old_price", nullable = false)
    private float oldPrice;

    @Column(name = "promo_price", nullable = false)
    private float promoPrice;

    @Column(name = "valid_until", nullable = false)
    private LocalDateTime validUntil;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "offers_products",
            joinColumns = @JoinColumn(
                    name = "offer_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "product_id",
                    referencedColumnName = "id"
            )
    )
    private List<Product> products;

}
