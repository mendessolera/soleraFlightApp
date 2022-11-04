package com.example.Reservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {
    //sabe info about the flight
    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String nationality;
    @Column
    private int identification;
    @Column
    private String age;
    //now to save info about flight
    @Column
    private String origin;
    @Column
    private String destination;
    // this baggage is if the user wants, not the same as Flight microservice (which is possible or not)
    @Column
    private boolean baggage;
    @Column
    private int price;
    @Column
    private Date dateformat;
    @Column
    private String airline;
    @Column
    private boolean scales;

    public Reservation() {
    }

    public Reservation(int id, String name, String nationality, int identification, String age, String origin, String destination, boolean baggage, int price, Date dateformat, String airline, boolean scales) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.identification = identification;
        this.age = age;
        this.origin = origin;
        this.destination = destination;
        this.baggage = baggage;
        this.price = price;
        this.dateformat = dateformat;
        this.airline = airline;
        this.scales = scales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isBaggage() {
        return baggage;
    }

    public void setBaggage(boolean baggage) {
        this.baggage = baggage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateformat() {
        return dateformat;
    }

    public void setDateformat(Date dateformat) {
        this.dateformat = dateformat;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public boolean isScales() {
        return scales;
    }

    public void setScales(boolean scales) {
        this.scales = scales;
    }
}
