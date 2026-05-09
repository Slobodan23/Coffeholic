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

}
