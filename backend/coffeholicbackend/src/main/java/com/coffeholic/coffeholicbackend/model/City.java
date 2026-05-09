package com.coffeholic.coffeholicbackend.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String naziv;
    @ManyToOne(optional = false)
    private Country country;
    @OneToMany(mappedBy = "city")
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
