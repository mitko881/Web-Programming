package mk.finki.ukim.mk.lab04.repository.inmemory;

import mk.finki.ukim.mk.lab04.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab04.model.EventBooking;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class InMemoryEventBookingRepository {

    public void addBooking(EventBooking eventBooking) {
        DataHolder.bookings.add(eventBooking);
    }

    public List<EventBooking> listAllBookings() {
        return DataHolder.bookings;
    }

    public List<EventBooking> keywordSearch(String text) {
        return DataHolder.bookings.stream()
                .filter(booking -> booking.getEventName().toLowerCase().contains(text.toLowerCase()))
                .collect(Collectors.toList());
    }
}
