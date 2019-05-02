package springbootstarter.service;

import org.springframework.stereotype.Service;
import springbootstarter.model.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EventService {

    List<Event> events = new ArrayList<>(Arrays.asList(
            new Event("1", "Fullmoon", "Ludvig"),
            new Event("2", "Solar Eclipse", "Ludvig"),
            new Event("3", "My birthday", "Ludvig")
    ));

    public List<Event> getEvents() {
        return events;
    }

    public Event getEvent(String id) {
        return events.stream().filter(e -> e.getId().equals(id)).findFirst().get();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void updateEvent(String id, Event event) {

        for(int i = 0; i < events.size(); i++) {
            Event e = events.get(i);
            if(e.getId().equals(id)) {
                events.set(i, event);
                return;
            }
        }
    }

    public void deleteEvent(String id) {
        events.removeIf(e -> e.getId().equals(id));
    }
}
