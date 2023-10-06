package com.frankmoley.linkedin_learning.learningspring.webservice;

import com.frankmoley.linkedin_learning.learningspring.business.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WebserviceController {
    private final ReservationService reservationService;
}
