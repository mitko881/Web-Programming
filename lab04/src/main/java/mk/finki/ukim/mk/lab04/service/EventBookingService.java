package mk.finki.ukim.mk.lab04.service;

import mk.finki.ukim.mk.lab04.model.EventBooking;

import java.util.List;

public interface EventBookingService{
    EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, Double numberOfTickets);

    List<EventBooking> listForAttendee(String attendeeName);

    List<EventBooking> search(String text);
}