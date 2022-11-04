package com.example.FlightParametersService.controller;

import com.example.FlightParametersService.model.FlightParameters;
import com.example.FlightParametersService.service.FlightParametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.util.List;
import java.util.zip.DataFormatException;

@RestController
public class FlightParametersController {

    @Autowired
    FlightParametersService flightParametersService;
    @GetMapping("/flight")
    private List<FlightParameters> getAllFlightParameters(){
        return flightParametersService.getAllFlights();
    }

    @GetMapping("/flight/{id}")
    private FlightParameters getFlightById(@PathVariable("id") int id){

        return flightParametersService.getFlightsByID(id);
    }

    @GetMapping("/flight/airline/{airline}")
    private List<FlightParameters> getFlightByAirLine(
            @PathVariable("airline") String airline){
        return flightParametersService.getFlightsByAirline(airline);
    }


    @GetMapping("/flight/scales/{scales}")
    private List<FlightParameters> getFlightByScale(@PathVariable("scales") boolean scales){
        return flightParametersService.getFlightsByScales(scales);
    }

    @GetMapping("/flight/baggage/{baggage}")
    private List<FlightParameters> getFlightsByBaggage(@PathVariable("baggage") boolean baggage)
    {
        return flightParametersService.getFlightsByBaggage(baggage);
    }

    @GetMapping("/flight/{dateformat}")
    private List<FlightParameters>getFlightBydateFormat(@PathVariable("dateformat")DateFormat dateformat){
        return flightParametersService.getFlightsBydateFormat(dateformat);
    }
}
