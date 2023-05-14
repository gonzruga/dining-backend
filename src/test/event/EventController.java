package com.gonza.dining.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "event")
public class EventController2 {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/")
    public List<Event> getEvent() {

        return eventService.getEvent();

    }

}

/*

// # 2
  @GetMapping("/")
    public List<Event> getEvent() {

        return List.of(
                new Event(
                        1L, "May Day Grilling","Grill & Prull", "Burgers", "Spend your Celebration Day with grilled steak",
                        LocalDate.of(2023, Month.MAY,1),"Mikonkatu 4", "https://www.facebook.com/grillpruul/", 8
                )
        );
    }

*/