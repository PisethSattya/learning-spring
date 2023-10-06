package com.frankmoley.linkedin_learning.learningspring.data;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "GUEST")
public class Guest
{
    @Id
    @Column(name = "GUEST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long guestId;
     //   GUEST_ID BIGSERIAL PRIMARY KEY,

    @Column(name = "FIRST_NAME")
    private String firstName;
    //  FIRST_NAME VARCHAR(64),

    @Column(name = "LAST_NAME")
    private String lastName;
    //   LAST_NAME VARCHAR(64),

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    //  EMAIL_ADDRESS VARCHAR(64),

    @Column(name = "ADDRESS")
    private String address;
    //  ADDRESS VARCHAR(64),

    @Column(name = "COUNTRY")
    private String country;
    //  COUNTRY VARCHAR(32),

    @Column(name = "STATE")
    private String state;
    // STATE VARCHAR(12),

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    // PHONE_NUMBER VARCHAR(24)

}
