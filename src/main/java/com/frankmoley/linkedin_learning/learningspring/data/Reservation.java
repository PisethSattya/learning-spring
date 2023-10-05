package com.frankmoley.linkedin_learning.learningspring.data;

import jakarta.persistence.*;

import java.util.Date;

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


    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", roomId=" + roomId +
                ", guestId=" + guestId +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
