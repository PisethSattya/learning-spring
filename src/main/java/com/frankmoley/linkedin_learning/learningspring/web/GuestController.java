package com.frankmoley.linkedin_learning.learningspring.web;

import com.frankmoley.linkedin_learning.learningspring.business.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/guests")
@RequiredArgsConstructor
public class GuestController
{
    private final ReservationService reservationService;

    @RequestMapping(method = RequestMethod.GET)
    public String getGuests(Model model)
    {
        model.addAttribute("guests",this.reservationService.getHotelGuests());
        return "hotel-guests";
    }
}
