package com.fetefusion.FeteFusion.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
