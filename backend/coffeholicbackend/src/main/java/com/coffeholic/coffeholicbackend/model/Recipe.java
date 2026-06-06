package com.coffeholic.coffeholicbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Document(collection = "recipes")
public class Recipe {
    @Id
    private String id;
    @DBRef
    private Beans beans;
    @DBRef
    private Addons addons;
    private String description;
    @DBRef
    private Coffe coffe;

    public Recipe() {
    }

    public Recipe(String description, Coffe coffe) {
        this.description = description;
        this.coffe = coffe;
    }

    public Recipe(Beans beans, Addons addons, String description, Coffe coffe) {
        this.beans = beans;
        this.addons = addons;
        this.description = description;
        this.coffe = coffe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Beans getBeans() {
        return beans;
    }

    public void setBeans(Beans beans) {
        this.beans = beans;
    }

    public Addons getAddons() {
        return addons;
    }

    public void setAddons(Addons addons) {
        this.addons = addons;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Coffe getCoffe() {
        return coffe;
    }

    public void setCoffe(Coffe coffe) {
        this.coffe = coffe;
    }
}
