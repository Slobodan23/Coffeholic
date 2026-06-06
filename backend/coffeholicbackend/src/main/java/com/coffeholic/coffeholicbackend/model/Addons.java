package com.coffeholic.coffeholicbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Document(collection = "addons")
public class Addons {
    @Id
    private String id;
    private String name;
    private Float temperatureStore;
    private Float price;
    private String description;
    @DBRef
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
