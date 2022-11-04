package com.example.DataAnalytics.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Data")
public class DataAnalytics {
    @Id
    @Column
    private int id;
    @Column
    private String country;
    @Column
    private int clicks;

    public DataAnalytics() {
    }

    public DataAnalytics(int id, String country, int clicks) {
        this.id = id;
        this.country = country;
        this.clicks = clicks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
}
