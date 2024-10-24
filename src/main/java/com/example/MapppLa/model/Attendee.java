package com.example.MapppLa.model;

import jakarta.persistence.*;

@Entity
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendee_id")
    private Long attendeeId;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Column(name = "attendee_firstname")
    private String attendeeFirstname;

    @Column(name = "attendee_lastname")
    private String attendeeLastname;

    @Column(name = "attendee_email")
    private String attendeeEmail;

    @Column(name = "attendee_phone")
    private String attendeePhone;

    @Column(name = "rsvp_status")
    private String rsvpStatus;

    @Column(name = "special_requests")
    private String specialRequests;

    // Constructors, Getters and Setters


    public Long getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(Long attendeeId) {
        this.attendeeId = attendeeId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getAttendeeFirstname() {
        return attendeeFirstname;
    }

    public void setAttendeeFirstname(String attendeeFirstname) {
        this.attendeeFirstname = attendeeFirstname;
    }

    public String getAttendeeLastname() {
        return attendeeLastname;
    }

    public void setAttendeeLastname(String attendeeLastname) {
        this.attendeeLastname = attendeeLastname;
    }

    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    public void setAttendeeEmail(String attendeeEmail) {
        this.attendeeEmail = attendeeEmail;
    }

    public String getAttendeePhone() {
        return attendeePhone;
    }

    public void setAttendeePhone(String attendeePhone) {
        this.attendeePhone = attendeePhone;
    }

    public String getRsvpStatus() {
        return rsvpStatus;
    }

    public void setRsvpStatus(String rsvpStatus) {
        this.rsvpStatus = rsvpStatus;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }

}
