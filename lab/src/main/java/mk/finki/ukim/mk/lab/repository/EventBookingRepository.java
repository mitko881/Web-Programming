package mk.finki.ukim.mk.lab.repository;


import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.EventBooking;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventBookingRepository {

    public void addBooking(EventBooking eventBooking) {

        DataHolder.bookings.add(eventBooking);
    }
}

