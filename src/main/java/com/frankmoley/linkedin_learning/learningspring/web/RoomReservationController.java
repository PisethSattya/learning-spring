package com.frankmoley.linkedin_learning.learningspring.web;

import com.frankmoley.linkedin_learning.learningspring.business.ReservationService;
import com.frankmoley.linkedin_learning.learningspring.business.RoomReservation;
import com.frankmoley.linkedin_learning.learningspring.util.DataUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class RoomReservationController
{
    private final DataUtils dataUtils;
    private final ReservationService reservationService;

    public RoomReservationController(DataUtils dataUtils, ReservationService reservationService) {
        this.dataUtils = dataUtils;
        this.reservationService = reservationService;
    }
@RequestMapping(method = RequestMethod.GET)
    public String getReservations(@RequestParam(value = "date", required = false) String dateString, Model model)
    {
        Date date = this.dataUtils.createDateFromDateString(dateString);
        List<RoomReservation> roomReservations = this.reservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservations);
        return "roomres";
    }
}
