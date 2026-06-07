package com.coffeholic.coffeholicbackend.dto;

import java.util.List;

public class CityDTO {
    private String id;
    private String naziv;
    private String countryId;
    private List<String> beansIds;

    public CityDTO() {
    }

    public CityDTO(String naziv, String countryId) {
        this.naziv = naziv;
        this.countryId = countryId;
    }

    public CityDTO(String naziv, String countryId, List<String> beansIds) {
        this.naziv = naziv;
        this.countryId = countryId;
        this.beansIds = beansIds;
    }

    public CityDTO(String id, String naziv, String countryId, List<String> beansIds) {
        this.id = id;
        this.naziv = naziv;
        this.countryId = countryId;
        this.beansIds = beansIds;
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

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public List<String> getBeansIds() {
        return beansIds;
    }

    public void setBeansIds(List<String> beansIds) {
        this.beansIds = beansIds;
    }
}
