package com.QuickClaim.NetHelp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee extends User implements Serializable {
    @Column
    private String code;
    @OneToMany(mappedBy="employee")
    private List<Complaint> complaints;

    public Employee(String code,Long id, String username, String email, String password) {
        super(id,username,email,password);
        this.code = code;
    }
}
