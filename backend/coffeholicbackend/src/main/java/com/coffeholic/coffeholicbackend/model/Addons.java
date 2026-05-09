package com.coffeholic.coffeholicbackend.model;

import jakarta.persistence.*;

@Entity
public class Addons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Float temperatureStore;
    @Column(nullable = false)
    private Float price;
    @Column(nullable = false)
    private String description;
    @ManyToOne(optional = false)
    private Recipe recipe;

    public Addons() {
    }

    public Addons(String name, Float temperatureStore, Float price, String description, Recipe recipe) {
        this.name = name;
        this.temperatureStore = temperatureStore;
        this.price = price;
        this.description = description;
        this.recipe = recipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getTemperatureStore() {
        return temperatureStore;
    }

    public void setTemperatureStore(Float temperatureStore) {
        this.temperatureStore = temperatureStore;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

}
