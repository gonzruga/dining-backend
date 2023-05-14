package com.gonza.dining.repository;


import com.gonza.dining.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByPublishedContaining(boolean published);
    List<Event> findByCuisineContaining(String cuisine);

    List<Event> findByPublished(boolean b);
}
