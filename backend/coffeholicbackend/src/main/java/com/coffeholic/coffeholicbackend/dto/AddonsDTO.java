package com.coffeholic.coffeholicbackend.dto;

public class AddonsDTO {
    private String id;
    private String name;
    private Float temperatureStore;
    private Float price;
    private String description;
    private String recipeId;

    public AddonsDTO() {
    }

    public AddonsDTO(String name, Float temperatureStore, Float price, String description, String recipeId) {
        this.name = name;
        this.temperatureStore = temperatureStore;
        this.price = price;
        this.description = description;
        this.recipeId = recipeId;
    }

    public AddonsDTO(String id, String name, Float temperatureStore, Float price, String description, String recipeId) {
        this.id = id;
        this.name = name;
        this.temperatureStore = temperatureStore;
        this.price = price;
        this.description = description;
        this.recipeId = recipeId;
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

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
}
