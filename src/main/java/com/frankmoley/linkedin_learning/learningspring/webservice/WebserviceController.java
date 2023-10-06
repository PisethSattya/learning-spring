package com.frankmoley.linkedin_learning.learningspring.webservice;

import com.frankmoley.linkedin_learning.learningspring.business.ReservationService;
import com.frankmoley.linkedin_learning.learningspring.business.RoomReservation;
import com.frankmoley.linkedin_learning.learningspring.util.DateUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
