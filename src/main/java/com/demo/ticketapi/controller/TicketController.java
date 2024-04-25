package com.demo.ticketapi.controller;

import com.demo.ticketapi.model.FlightDto;
import com.demo.ticketapi.model.Ticket;
import com.demo.ticketapi.service.FlightClient;
import com.demo.ticketapi.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketservice;

    @Autowired
    private FlightClient flightClient;

    @GetMapping("")
    public List<Ticket> getAllTickets() {
        return ticketservice.getAllTickets();
    }

    @GetMapping("/vuelos")
    public List<FlightDto> getAllFlights(){
        return flightClient.getAllFlights();
    }

    @PostMapping("/add")
    public Ticket addTicket(@RequestBody Ticket ticket){
        return ticketservice.addTicket(ticket);
    }



}
