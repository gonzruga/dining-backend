package com.gonza.dining.event;

import jakarta.persistence.*; //Make sure to have .persistence - to work even if herbiante changes

import java.util.Collection;

@Entity  // For Hibernate
@Table // For the table in database
public class Event {
@Id
@SequenceGenerator(
        name = "event_sequence",
        sequenceName = "event_sequence", // sequenceName is default
        allocationSize = 1  //default
)

@GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "event_sequence"
)
    private Long id;
    private String eventId;
    private String restaurantName;
    private String cuisine;
    private String description;
    private String date;
    private String address;
    private String menuLink;

    private int attendence; // @Transient

    //No Args Constructor
    public Event() {
    }

    public Event(Long id, String eventId, String restaurantName, String cuisine, String description, String date, String address, String menuLink, int attendence) {
        this.id = id;
        this.eventId = eventId;
        this.restaurantName = restaurantName;
        this.cuisine = cuisine;
        this.description = description;
        this.date = date;
        this.address = address;
        this.menuLink = menuLink;
        this.attendence = attendence;
    }

    // Constructor without ID because the database will generate ID.
    public Event(String eventId, String restaurantName, String cuisine, String description, String date, String address, String menuLink, int attendence) {
        this.eventId = eventId;
        this.restaurantName = restaurantName;
        this.cuisine = cuisine;
        this.description = description;
        this.date = date;
        this.address = address;
        this.menuLink = menuLink;
        this.attendence = attendence;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String geteventId() {
        return eventId;
    }

    public void seteventId(String eventId) {
        this.eventId = eventId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getmenuLink() {
        return menuLink;
    }

    public void setmenuLink(String menuLink) {
        this.menuLink = menuLink;
    }

    public int getattendence() {
        return attendence;
    }

    public void setattendence(int attendence) {
        this.attendence = attendence;
    }

    @Override
    public String toString() {
        return "event{" +
                "id=" + id +
                ", eventId='" + eventId + '\'' +
                ", restaurantName='" + restaurantName + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", menuLink='" + menuLink + '\'' +
                ", attendence=" + attendence +
                '}';
    }
}
