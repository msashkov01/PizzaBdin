package com.example.pizzabdin.domain.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Map;

@Entity
@Table(name = "receipt")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Receipt extends BaseEntity {

    @ElementCollection
    @MapKeyColumn(name = "ingredient")
    @CollectionTable(name = "product_ingredients")
    @AttributeOverrides({@AttributeOverride(name = "value.quantity", column = @Column(name = "ingredient_quantity")),
            @AttributeOverride(name = "value.measurement", column = @Column(name = "ingredient_measurement"))})
    private Map<Ingredient, IngredientDetail> ingredients;

    @OneToOne(mappedBy = "receipt")
    private Product product;
}
