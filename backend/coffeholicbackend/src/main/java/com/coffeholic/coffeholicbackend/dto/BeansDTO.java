package com.coffeholic.coffeholicbackend.dto;

public class BeansDTO {
    private String id;
    private String name;
    private String countryId;
    private String cityId;
    private Float price;
    private Float temperatureStore;
    private String description;
    private String recipeId;

    public BeansDTO() {
    }

    public BeansDTO(String name, String countryId, String cityId, Float price, Float temperatureStore,
            String description, String recipeId) {
        this.name = name;
        this.countryId = countryId;
        this.cityId = cityId;
        this.price = price;
        this.temperatureStore = temperatureStore;
        this.description = description;
        this.recipeId = recipeId;
    }

    public BeansDTO(String id, String name, String countryId, String cityId, Float price, Float temperatureStore,
            String description, String recipeId) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.cityId = cityId;
        this.price = price;
        this.temperatureStore = temperatureStore;
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

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getTemperatureStore() {
        return temperatureStore;
    }

    public void setTemperatureStore(Float temperatureStore) {
        this.temperatureStore = temperatureStore;
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
