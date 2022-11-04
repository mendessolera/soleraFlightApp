package com.example.FlightParametersService.repository;

import com.example.FlightParametersService.model.FlightParameters;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface FlightParamatersRepository extends CrudRepository<FlightParameters, Integer> {

    List<FlightParameters> findByAirline(String airline);
    List<FlightParameters> findByScales(boolean scales);
    List<FlightParameters> findByBaggage(boolean baggage);
    List<FlightParameters> findByDateFormat(DateFormat dateformat);

}
