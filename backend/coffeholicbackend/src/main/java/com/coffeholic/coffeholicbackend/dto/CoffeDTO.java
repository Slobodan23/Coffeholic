package com.coffeholic.coffeholicbackend.dto;

public class CoffeDTO {
    private String id;
    private String name;
    private String recipeId;

    public CoffeDTO() {
    }

    public CoffeDTO(String name) {
        this.name = name;
    }

    public CoffeDTO(String name, String recipeId) {
        this.name = name;
        this.recipeId = recipeId;
    }

    public CoffeDTO(String id, String name, String recipeId) {
        this.id = id;
        this.name = name;
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

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
}
