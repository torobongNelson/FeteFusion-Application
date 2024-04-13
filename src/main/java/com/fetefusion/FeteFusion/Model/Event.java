package com.fetefusion.FeteFusion.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Event {
    @Id
    private Long id;
    private String name;
    private String description;
    private String location;
    private EventType type;
    private LocalDateTime date;
    @OneToOne
    @JoinColumn(name = "user_id")//referencing the User table and showing their relationships
    private User createdBy;


}
