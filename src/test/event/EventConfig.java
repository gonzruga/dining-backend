package com.gonza.dining.event;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EventConfig {

    @Bean
    CommandLineRunner commandLineRunner(EventRepository repository) {
        return args -> {
            Event event1Easter = new Event(
                    "01",
                    "Grill & Prull",
                    "Burgers",
                    "Spend your Celebration Day with grilled steak",
                    "May ",
                    "Mikonkatu 4",
                    "www.facebook.com/grillpruul",
                    8

            );
            Event event2MayDay = new Event(
                    "02",
                    "VARKIZANA GRILL",
                    "Greek",
                    "The best grill in town",
                    "June 23",
                    "Viru Väljak 2",
                    "www.tommigrill.com/en/menuu",
                    10

            );

            repository.saveAll(List.of(event1Easter, event2MayDay));

        };
    }
}
