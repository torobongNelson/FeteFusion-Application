package com.fetefusion.FeteFusion.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "ticket_id")
    private List<TicketCategory> category;
    private Integer quantity;

}
