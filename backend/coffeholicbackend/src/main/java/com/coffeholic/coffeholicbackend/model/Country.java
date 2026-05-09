package com.coffeholic.coffeholicbackend.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String naziv;
    @Column(nullable = false)
    private String kontinent;
    @OneToMany(mappedBy = "country")
    private List<City> cities;
    @OneToMany(mappedBy = "country")
    private List<Beans> beans;

    public Country() {
    }

    public Country(String naziv, String kontinent) {
        this.naziv = naziv;
        this.kontinent = kontinent;
    }

    public Country(String naziv, String kontinent, List<City> cities, List<Beans> beans) {
        this.naziv = naziv;
        this.kontinent = kontinent;
        this.cities = cities;
        this.beans = beans;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKontinent() {
        return kontinent;
    }

    public void setKontinent(String kontinent) {
        this.kontinent = kontinent;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public List<Beans> getBeans() {
        return beans;
    }

    public void setBeans(List<Beans> beans) {
        this.beans = beans;
    }
}
