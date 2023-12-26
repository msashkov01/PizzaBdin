package com.example.pizzabdin.domain.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Entity
@Table(name = "delivery")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Delivery extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User guarantor;

    @ManyToOne
    @JoinColumn(name = "storehouse_id")
    private Storehouse storehouse;

    @ElementCollection
    @MapKeyColumn(name = "ingredient_for_delivery")
    @CollectionTable(name = "delivery_ingredients")
    @AttributeOverrides({@AttributeOverride(name = "value.quantity", column = @Column(name = "ingredient_quantity_for_delivery")),
            @AttributeOverride(name = "value.measurement", column = @Column(name = "ingredient_measurement_for_delivery"))})
    private Map<Ingredient, IngredientDetail> orders;
}
