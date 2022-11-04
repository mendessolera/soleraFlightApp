package com.example.Reservation.service;

import com.example.Reservation.model.Reservation;
import com.example.Reservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    public List<Reservation> getAllReservations()
    {
        List<Reservation> allReservations = new ArrayList<>();
        reservationRepository.findAll().forEach(reservation -> allReservations.add(reservation));
        return allReservations;
    }
    public List<Reservation> getReservationByIdentification(String identification)
    {
        List<Reservation> reservationsByIdentification = reservationRepository.findByIdentification(identification);
        return reservationsByIdentification;
    }

    public Reservation saveNewReservation(Reservation newReservation) {
        return reservationRepository.save(newReservation);
    }
}
