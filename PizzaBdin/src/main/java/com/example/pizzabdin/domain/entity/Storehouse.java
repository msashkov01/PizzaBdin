package com.example.pizzabdin.domain.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Entity
@Table(name = "storehouse")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Storehouse extends BaseEntity {

    @OneToMany(mappedBy = "storehouse", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Delivery> historyOfDeliveries;

    @ElementCollection
    @MapKeyColumn(name = "stock")
    @CollectionTable(name = "storehouse_stocks")
    @AttributeOverrides({@AttributeOverride(name = "value.quantity", column = @Column(name = "stock_quantity")),
            @AttributeOverride(name = "value.measurement", column = @Column(name = "stock_measurement"))})
    private Map<Ingredient, IngredientDetail> inventory;
}
