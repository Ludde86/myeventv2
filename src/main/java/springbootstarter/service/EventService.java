package springbootstarter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootstarter.model.Event;
import springbootstarter.repository.EventRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getEvents() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(events::add);
        return events;
    }

    public Event getEvent(String id) {
        return eventRepository.findById(id).orElse(null);
    }

    public void addEvent(Event event) {
        eventRepository.save(event);
    }

    public void updateEvent(String id, Event event) {

        eventRepository.save(event);

    }

    public void deleteEvent(String id) {
        eventRepository.deleteById(id);
    }
}
