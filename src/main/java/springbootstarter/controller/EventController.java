package springbootstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springbootstarter.model.Event;
import springbootstarter.service.EventService;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/events/{id}")
    public Event getEvent(@PathVariable String id) {
        return eventService.getEvent(id);
    }

    @GetMapping("/events")
    public List<Event> getEvents() {
        return eventService.getEvents();
    }

    @PostMapping(value = "/events")
    public void addEvent(@RequestBody Event event) {
        eventService.addEvent(event);
    }

    @PutMapping(value = "/events/{id}")
    public void updateEvent(@RequestBody Event event, @PathVariable String id) {
        eventService.updateEvent(id, event);
    }

    @DeleteMapping("/events/{id}")
    public void deleteEvent(@PathVariable String id) {
        eventService.deleteEvent(id);
    }

}