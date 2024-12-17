package mk.finki.ukim.mk.lab04.service;

import mk.finki.ukim.mk.lab04.model.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {
    List<Event> listAll();
    List<Event> searchEvents(String name, String description, Double rating);
    void removeById(Long id);
    Event saveEvent(String name, String description, Double popularityScore, Long locationId);
    Optional<Event> findById(Long id);
    Event editEvent(Long id, String name, String description, Double popularityScore, Long locationId);
}