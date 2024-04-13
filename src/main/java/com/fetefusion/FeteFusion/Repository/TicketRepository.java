package com.fetefusion.FeteFusion.Repository;

import com.fetefusion.FeteFusion.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
