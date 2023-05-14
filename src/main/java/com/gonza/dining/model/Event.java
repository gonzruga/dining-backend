package com.gonza.dining.model;

import jakarta.persistence.*;

@Entity
@Table(name = "event_table")
public class Event {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "eventid")
    private String eventId;
    @Column(name = "restaurantname")
    private String restaurantName;
    @Column(name = "cuisine")
    private String cuisine;
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    private String date;
    @Column(name = "address")
    private String address;
    @Column(name = "menulink")
    private String menuLink;

    @Column(name = "attendance")
    private int attendance; // @Transient

    @Column(name = "published")
    private boolean published;



    //No Args Constructor
    public Event() {
    }

    public Event(Long id, String eventId, String restaurantName, String cuisine, String description, String date, String address, String menuLink, int attendance, Boolean published) {
        this.id = id;
        this.eventId = eventId;
        this.restaurantName = restaurantName;
        this.cuisine = cuisine;
        this.description = description;
        this.date = date;
        this.address = address;
        this.menuLink = menuLink;
        this.attendance = attendance;
        this.published = published;
    }

    // Constructor without ID because the database will generate ID.
    public Event(String eventId, String restaurantName, String cuisine, String description, String date, String address, String menuLink, int attendance, Boolean published) {
        this.eventId = eventId;
        this.restaurantName = restaurantName;
        this.cuisine = cuisine;
        this.description = description;
        this.date = date;
        this.address = address;
        this.menuLink = menuLink;
        this.attendance = attendance;
        this.published = published;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
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

    public String getMenuLink() {
        return menuLink;
    }

    public void setMenuLink(String menuLink) {
        this.menuLink = menuLink;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public boolean isPublished() { return published; }

    public void setPublished(boolean published) { this.published = published; }

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
                ", attendance=" + attendance + '\'' +
                ", published=" + published +
                '}';
    }
    
    
    
}
