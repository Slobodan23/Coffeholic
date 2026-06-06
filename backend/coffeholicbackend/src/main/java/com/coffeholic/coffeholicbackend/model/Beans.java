package com.coffeholic.coffeholicbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Document(collection = "beans")
public class Beans {
    @Id
    private String id;
    private String name;
    private Country country;
    @DBRef
    private City city;
    private Float price;
    private Float temperatureStore;
    private String description;
    @DBRef
    private Recipe recipe;

    public Beans() {
    }

    public Beans(String name, Country country, City city, Float price, Float temperatureStore, String description,
            Recipe recipe) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.price = price;
        this.temperatureStore = temperatureStore;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

}
