package com.coffeholic.coffeholicbackend.dto;

public class RecipeDTO {
    private String id;
    private String beansId;
    private String addonsId;
    private String description;
    private String coffeId;

    public RecipeDTO() {
    }

    public RecipeDTO(String description, String coffeId) {
        this.description = description;
        this.coffeId = coffeId;
    }

    public RecipeDTO(String beansId, String addonsId, String description, String coffeId) {
        this.beansId = beansId;
        this.addonsId = addonsId;
        this.description = description;
        this.coffeId = coffeId;
    }

    public RecipeDTO(String id, String beansId, String addonsId, String description, String coffeId) {
        this.id = id;
        this.beansId = beansId;
        this.addonsId = addonsId;
        this.description = description;
        this.coffeId = coffeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeansId() {
        return beansId;
    }

    public void setBeansId(String beansId) {
        this.beansId = beansId;
    }

    public String getAddonsId() {
        return addonsId;
    }

    public void setAddonsId(String addonsId) {
        this.addonsId = addonsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoffeId() {
        return coffeId;
    }

    public void setCoffeId(String coffeId) {
        this.coffeId = coffeId;
    }
}
