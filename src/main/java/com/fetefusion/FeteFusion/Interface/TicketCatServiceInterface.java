package com.fetefusion.FeteFusion.Interface;

import com.fetefusion.FeteFusion.Model.TicketCategory;

public interface TicketCatServiceInterface {
    TicketCategory createTicketCategory(TicketCategory ticketCategory);
    TicketCategory viewTicketCategory(Long id);
    TicketCategory updateTicketCategory(TicketCategory ticketCat);
    void deleteTicketCategory(Long id);


}
