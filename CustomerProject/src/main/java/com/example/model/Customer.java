package com.example.model;

import com.example.enumeration.Status;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

private String customerName;


private String email;

private long customerNo;

private String message;

@Enumerated(EnumType.STRING)
private Status status=Status.RED;
}
