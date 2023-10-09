package com.juniorcoder.springdatajpa2.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "address")
public class Address {
    @Id
    @GeneratedValue
    private Integer id;

    private String streetName;
    private String houseNumber;

    private String zipCode;

    @OneToOne
    @JoinColumn(name = "employe_id")
    private Employee emploee;


}
