package com.coffeholic.coffeholicbackend.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Document(collection = "countries")
public class Country {
    @Id
    private String id;
    private String naziv;
    private String kontinent;
    @DBRef
    private List<City> cities;
    @DBRef
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
