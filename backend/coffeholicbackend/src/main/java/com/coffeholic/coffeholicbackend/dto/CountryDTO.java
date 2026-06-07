package com.coffeholic.coffeholicbackend.dto;

import java.util.List;

public class CountryDTO {
    private String id;
    private String naziv;
    private String kontinent;
    private List<String> cityIds;
    private List<String> beansIds;

    public CountryDTO() {
    }

    public CountryDTO(String naziv, String kontinent) {
        this.naziv = naziv;
        this.kontinent = kontinent;
    }

    public CountryDTO(String naziv, String kontinent, List<String> cityIds, List<String> beansIds) {
        this.naziv = naziv;
        this.kontinent = kontinent;
        this.cityIds = cityIds;
        this.beansIds = beansIds;
    }

    public CountryDTO(String id, String naziv, String kontinent, List<String> cityIds, List<String> beansIds) {
        this.id = id;
        this.naziv = naziv;
        this.kontinent = kontinent;
        this.cityIds = cityIds;
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

    public String getKontinent() {
        return kontinent;
    }

    public void setKontinent(String kontinent) {
        this.kontinent = kontinent;
    }

    public List<String> getCityIds() {
        return cityIds;
    }

    public void setCityIds(List<String> cityIds) {
        this.cityIds = cityIds;
    }

    public List<String> getBeansIds() {
        return beansIds;
    }

    public void setBeansIds(List<String> beansIds) {
        this.beansIds = beansIds;
    }
}
