package com.coffeholic.coffeholicbackend.model;

import jakarta.persistence.*;

@Entity
public class Coffe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "coffe")
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

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

}
