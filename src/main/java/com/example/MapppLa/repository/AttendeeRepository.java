package com.example.MapppLa.repository;

import com.example.MapppLa.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
    List<Attendee> findByEvent_EventId(Long eventId);
}