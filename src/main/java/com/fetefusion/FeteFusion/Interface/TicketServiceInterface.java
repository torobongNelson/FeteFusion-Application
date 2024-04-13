package com.fetefusion.FeteFusion.Interface;

import com.fetefusion.FeteFusion.Model.Ticket;

public interface TicketServiceInterface {
    Ticket createTicket (Ticket ticket);
    Ticket viewTicket(Long id);
    Ticket updateTicket(Ticket ticket);
    void deleteTicket(Long id);
}
