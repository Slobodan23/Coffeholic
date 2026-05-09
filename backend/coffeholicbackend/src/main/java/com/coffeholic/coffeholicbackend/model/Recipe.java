package com.coffeholic.coffeholicbackend.model;

import jakarta.persistence.*;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "recipe")
    private Beans beans;
    @OneToMany(mappedBy = "recipe")
    private Addons addons;
    @Column(nullable = false)
    private String description;
    @ManyToOne(optional = false)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
