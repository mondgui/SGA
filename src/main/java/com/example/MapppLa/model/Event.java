package com.example.MapppLa.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventId")
    private Long eventId;

    @Column(name = "eventName", nullable = false)
    private String eventName;

    @Column(name = "eventDate", nullable = false)
    private LocalDate eventDate;

    @Column(name = "eventTime", nullable = false)
    private LocalTime eventTime;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "eventType", nullable = false)
    private String eventType;

    @Column(name = "status", nullable = false)
    private String status;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Attendee> attendees;

    // Constructors, Getters and Setters


    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }

}

