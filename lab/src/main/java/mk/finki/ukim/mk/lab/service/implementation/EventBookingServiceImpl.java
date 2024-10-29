package mk.finki.ukim.mk.lab.service.implementation;


import mk.finki.ukim.mk.lab.model.EventBooking;
import mk.finki.ukim.mk.lab.repository.EventBookingRepository;
import mk.finki.ukim.mk.lab.service.EventBookingService;
import org.springframework.stereotype.Service;

@Service
public class EventBookingServiceImpl implements EventBookingService {

    EventBookingRepository eventBookingRepository;

    public EventBookingServiceImpl(EventBookingRepository eventBookingRepository) {
        this.eventBookingRepository = eventBookingRepository;
    }

    @Override
    public EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, Double numberOfTickets) {
        EventBooking newBooking = new EventBooking(eventName, attendeeName, attendeeAddress, numberOfTickets);

        eventBookingRepository.addBooking(newBooking);

        return newBooking;
    }
}
