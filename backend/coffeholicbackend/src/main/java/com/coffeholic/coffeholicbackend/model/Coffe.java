package com.coffeholic.coffeholicbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Document(collection = "coffes")
public class Coffe {
    @Id
    private String id;
    private String name;
    @DBRef
    private Recipe recipe;

    public Coffe() {
    }

    public Coffe(String name) {
        this.name = name;
    }

    public Coffe(String name, Recipe recipe) {
        this.name = name;
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

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

}
