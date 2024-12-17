package mk.finki.ukim.mk.lab04.service.implementation;


import mk.finki.ukim.mk.lab04.model.EventBooking;
import mk.finki.ukim.mk.lab04.repository.inmemory.InMemoryEventBookingRepository;
import mk.finki.ukim.mk.lab04.service.EventBookingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventBookingServiceImpl implements EventBookingService {

    InMemoryEventBookingRepository eventBookingRepository;

    public EventBookingServiceImpl(InMemoryEventBookingRepository eventBookingRepository) {
        this.eventBookingRepository = eventBookingRepository;
    }

    @Override
    public EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, Double numberOfTickets) {
        EventBooking newBooking = new EventBooking(eventName, attendeeName, attendeeAddress, numberOfTickets);

        eventBookingRepository.addBooking(newBooking);

        return newBooking;
    }

    @Override
    public List<EventBooking> listForAttendee(String attendeeName) {
        return eventBookingRepository.listAllBookings().stream()
                .filter(booking -> booking.getAttendeeName().equals(attendeeName))
                .collect(Collectors.toList());
    }

    @Override
    public List<EventBooking> search(String text) {
        return eventBookingRepository.keywordSearch(text);
    }
}