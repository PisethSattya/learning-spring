package com.frankmoley.linkedin_learning.learningspring.util;

import com.frankmoley.linkedin_learning.learningspring.business.ReservationService;
import com.frankmoley.linkedin_learning.learningspring.business.RoomReservation;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent>
{
   private final ReservationService reservationService;
   private final DataUtils dataUtils;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event)
    {
        Date date = this.dataUtils.createDateFromDateString("2022-01-01");
        List<RoomReservation> reservations = this.reservationService.getRoomReservationsForDate(date);
        reservations.forEach(System.out::println);
    }
}
