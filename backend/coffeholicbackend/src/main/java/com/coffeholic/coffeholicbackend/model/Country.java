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
}
