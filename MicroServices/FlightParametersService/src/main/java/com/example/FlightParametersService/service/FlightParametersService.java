package com.example.FlightParametersService.service;

import com.example.FlightParametersService.model.FlightParameters;
import com.example.FlightParametersService.repository.FlightParamatersRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class FlightParametersService {

    @Autowired
    FlightParamatersRepository flightParamatersRepository;

    public List<FlightParameters> getAllFlights()
    {
        List<FlightParameters> allFlights = new ArrayList<>();
        flightParamatersRepository.findAll().forEach(flightParameters -> allFlights.add(flightParameters));
        return allFlights;
    }
    public FlightParameters getFlightsByID(int id)
    {
        return flightParamatersRepository.findById(id).get();
    }
    public List<FlightParameters> getFlightsByAirline(String airline)
    {
        List<FlightParameters> flightsAirline = flightParamatersRepository.findByAirline(airline).stream().toList();
        return flightsAirline;
    }
    public List<FlightParameters> getFlightsByScales(boolean scales)
    {
        List<FlightParameters> flightsScales = flightParamatersRepository.findByScales(scales = true).stream().toList();
        return flightsScales;
    }
    public List<FlightParameters> getFlightsByBaggage(boolean baggage)
    {
        List<FlightParameters> flightBaggage = flightParamatersRepository.findByBaggage(baggage = true).stream().toList();
        return flightBaggage;
    }

    public List<FlightParameters> getFlightsBydateFormat(DateFormat dateformat) {
        List<FlightParameters> flightdata = flightParamatersRepository.findByDateFormat(dateformat).stream().toList();
        return flightdata;
    }
}
