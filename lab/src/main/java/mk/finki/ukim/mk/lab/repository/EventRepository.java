package mk.finki.ukim.mk.lab.repository;


import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Event;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EventRepository {

    public List<Event> findAll() {
        return DataHolder.eventList;
    }

    public List<Event> search(String text, Double rating) {
        return DataHolder.eventList.stream()
                .filter(event -> event.getName().contains(text) || event.getDescription().contains(text))
                .filter(event -> event.getPopularityScore() > rating)
                .collect(Collectors.toList());
    }
}
