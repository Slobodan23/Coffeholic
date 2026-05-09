package com.coffeholic.coffeholicbackend.model;

import jakarta.persistence.*;

@Entity
public class Beans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @ManyToOne(optional = false)
    private Country country;
    @ManyToOne(optional = false)
    private City city;
    @Column(nullable = false)
    private Float price;
    @Column(nullable = false)
    private Float temperatureStore;
    @Column(nullable = false)
    private String description;

}
