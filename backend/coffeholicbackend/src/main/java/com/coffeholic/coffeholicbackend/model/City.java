package com.coffeholic.coffeholicbackend.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Document(collection = "cities")
public class City {
    @Id
    private String id;
    private String naziv;
    @DBRef
    private Country country;
    @DBRef
    private List<Beans> beans;

    public City() {
    }

    public City(String naziv, Country country) {
        this.naziv = naziv;
        this.country = country;
    }

    public City(String naziv, Country country, List<Beans> beans) {
        this.naziv = naziv;
        this.country = country;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Beans> getBeans() {
        return beans;
    }

    public void setBeans(List<Beans> beans) {
        this.beans = beans;
    }

}
