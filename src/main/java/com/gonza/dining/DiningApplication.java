package com.gonza.dining;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // Makes the classes inside to serve rest endpoints.
public class DiningApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiningApplication.class, args);
	}


}
// Optimize imports: opt + com + o

// # 1
//	@GetMapping("/")
//	public List<Event> hello() {
//
//		return List.of(
//				new Event(
//					1L, "May Day Grilling","Grill & Prull", "Burgers", "Spend your Celebration Day with grilled steak",
//						LocalDate.of(2023, Month.MAY,1),"Mikonkatu 4", "https://www.facebook.com/grillpruul/", 8
//				)
//		);
//	}