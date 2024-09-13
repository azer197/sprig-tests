package com.QuickClaim.NetHelp.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Complaint")
public class Complaint implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    @Column
    private String state;
    @Column
    private String type;
    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name="client_id", nullable=false)
    private Client client;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    public Complaint(Long id, String state, String type, String description, Client client, Employee employee) {
        this.id = id;
        this.state = state;
        this.type = type;
        this.description = description;
        this.client = client;
        this.employee = employee;
    }
}
