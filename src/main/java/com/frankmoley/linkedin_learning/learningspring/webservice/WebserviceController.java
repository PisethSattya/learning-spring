package com.frankmoley.linkedin_learning.learningspring.webservice;

import com.frankmoley.linkedin_learning.learningspring.business.ReservationService;
import com.frankmoley.linkedin_learning.learningspring.business.RoomReservation;
import com.frankmoley.linkedin_learning.learningspring.data.Guest;
import com.frankmoley.linkedin_learning.learningspring.data.Room;
import com.frankmoley.linkedin_learning.learningspring.util.DateUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WebserviceController {
    private final ReservationService reservationService;
    private final DateUtils dateUtils;

    @GetMapping
    @RequestMapping(path = "/reservations")
    public List<RoomReservation> getReservations(@RequestParam (value = "date",required = false) String dateString){
        Date date = dateUtils.createDateFromDateString(dateString);
        return reservationService.getRoomReservationsForDate(date);
    }

    @GetMapping("/guests")
    public List<Guest> getGuest(){
        return reservationService.getHotelGuests();
    }

    @PostMapping("/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody Guest guest)
    {
        reservationService.addGuest(guest);
    }

    @GetMapping("/rooms")
    public List<Room> getRooms(){
        return reservationService.getRoom();
    }
}
