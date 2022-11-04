package com.example.Reservation.controller;

import com.example.Reservation.ReservationApplication;
import com.example.Reservation.model.Reservation;
import com.example.Reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping("/reservations")
    private List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }

    @GetMapping("/reservations/{identification}")
    private List<Reservation> getReservationByIdentification(String identification){
        return reservationService.getReservationByIdentification(identification);
    }

    @PostMapping("/reservations")
    @CrossOrigin(origins = "*")
    private Reservation saveReservation(@RequestBody Reservation newReservation){
        return reservationService.saveNewReservation(newReservation);
    }

}
