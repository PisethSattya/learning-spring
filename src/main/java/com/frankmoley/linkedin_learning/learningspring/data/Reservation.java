package com.frankmoley.linkedin_learning.learningspring.data;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "RESERVATION")

public class Reservation
{
    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;
    //    RESERVATION_ID BIGSERIAL PRIMARY KEY,

    @Column(name = "ROOM_ID")
    private long roomId;
    //    ROOM_ID BIGINT NOT NULL,

    @Column(name = "GUEST_ID")
    private long guestId;
    //    GUEST_ID BIGINT NOT NULL,

    @Column(name = "RES_DATE")
    private Date reservationDate;
    //  RES_DATE DATE

}
