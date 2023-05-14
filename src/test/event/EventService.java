package com.gonza.dining.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 1. Make instance: @COMPONENT to be passed in EventController.
// 2. @SERVICE for readability/semantics

@Service
public class EventService {

    private final EventRepository eventRepository;

@Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEvent() {
        return eventRepository.findAll();  //there are many methods available to Repository: sort, find, etc
    }
}

// Before implementing Repository
/*

@GetMapping("/")
    public List<Event> getEvent() {

        return List.of(
                new Event(
                        1L, "May Day Grilling","Grill & Prull", "Burgers", "Spend your Celebration Day with grilled steak",
                        LocalDate.of(2023, Month.MAY,1),"Mikonkatu 4", "https://www.facebook.com/grillpruul/", 8
                )
        );
    }

// After implementing Repository there is no one in our database just [] empty array

 */