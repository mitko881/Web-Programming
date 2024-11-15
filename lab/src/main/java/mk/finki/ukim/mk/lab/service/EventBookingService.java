package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.EventBooking;

import java.util.List;

public interface EventBookingService{
    EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, Double numberOfTickets);

    List<EventBooking> listForAttendee(String attendeeName);

    List<Object> search(String text);
}