package com.QuickClaim.NetHelp.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Client")

public class Client extends User implements Serializable {

    @Column
    private Long phone_number;
    @OneToMany(mappedBy="client")
    private List<Complaint> complaints;

    public Client(Long phone_number,Long id, String username, String email, String password) {
        super(id,username,email,password);
        this.phone_number = phone_number;

    }
}
