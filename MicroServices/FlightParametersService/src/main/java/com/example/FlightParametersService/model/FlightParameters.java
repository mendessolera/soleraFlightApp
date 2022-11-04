package com.example.FlightParametersService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.cglib.core.Local;

import java.text.DateFormat;
import java.time.LocalDate;

@Entity
@Table(name = "flightparameters")
public class FlightParameters {
    @Id
    @Column
    private int id;
    @Column
    private String origin;
    @Column
    private String destination;
    @Column
    private boolean baggage;
    @Column
    private int price;
    @Column
    private DateFormat dateformat;

    @Column
    private String airline;
    @Column
    private boolean scales;


    public FlightParameters(int id, String origin, String destination, boolean baggage, int price, DateFormat dateformat, String airline, boolean scales) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.baggage = baggage;
        this.price = price;
        this.dateformat = dateformat;
        this.airline = airline;
        this.scales = scales;
    }
    public FlightParameters() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public DateFormat getDateFormat() {
        return dateformat;
    }

    public void setDateFormat(DateFormat dateformat) {
        this.dateformat = dateformat;
    }

    public String getAirLine() {
        return airline;
    }

    public void setAirLine(String airline) {
        this.airline = airline;
    }

    public boolean isScales() {
        return scales;
    }

    public void setScales(boolean scales) {
        this.scales = scales;
    }
}
