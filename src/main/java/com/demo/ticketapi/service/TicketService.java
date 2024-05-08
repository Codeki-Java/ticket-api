package com.demo.ticketapi.service;

import com.demo.ticketapi.model.FlightDto;
import com.demo.ticketapi.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
/*
    @Autowired
    FlightDto flightDto;*/

    private final List<Ticket> tickets = new ArrayList<>();

    public List<Ticket> getAllTickets() {
        return tickets;
    }


    //Metodo original
    public Ticket addTicket(Ticket addedTicket){
        tickets.add(addedTicket);
        return addedTicket;
    }


    //VER COMO USAR ticketMapper para crear un vuelo??

    // Este método mapea una lista de FlightDto a una lista de Ticket con los detalles del pasajero
    public Ticket ticketMapper(FlightDto flightDto, Ticket ticket) {
        Ticket newTicket = new Ticket();
        newTicket.setId(flightDto.getId());
        newTicket.setFlightDto(flightDto);
        newTicket.setPassengerName(ticket.getPassengerName());
        newTicket.setPassengerEmail(ticket.getPassengerEmail());
        newTicket.setPassengerPassport(ticket.getPassengerPassport());

        return newTicket;
    }

/*
    //Metodo addTicket Ale EN PROCESO
    public Ticket addTicket(Ticket ticket, Long flightDtoId) {
        // Obtener el vuelo correspondiente por su ID
        FlightDto flightDto = flightDto.getId(flightDtoId);

        // Mapear el ticket para el vuelo específico
        Ticket mappedTicket = ticketMapper(flightDto, ticket);

        // Agregar el ticket mapeado a la lista de tickets del servicio
        tickets.add(mappedTicket);

        // Retornar el ticket agregado
        return mappedTicket;
    }*/
}
