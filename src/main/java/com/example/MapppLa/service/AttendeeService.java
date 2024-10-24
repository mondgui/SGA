package com.example.MapppLa.service;

import com.example.MapppLa.model.Attendee;
import com.example.MapppLa.repository.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendeeService {

    @Autowired
    private AttendeeRepository attendeeRepository;

    public List<Attendee> getAllAttendees() {
        return attendeeRepository.findAll();
    }

    public List<Attendee> getAttendeesByEventId(Long eventId) {
        return attendeeRepository.findByEvent_EventId(eventId);
    }

    public Attendee saveAttendee(Attendee attendee) {
        return attendeeRepository.save(attendee);
    }

    public Attendee updateAttendee(Attendee attendee) {
        return attendeeRepository.save(attendee);
    }

    public void deleteAttendee(Long attendeeId) {
        attendeeRepository.deleteById(attendeeId);
    }
}