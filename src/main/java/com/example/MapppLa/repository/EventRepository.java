package com.example.MapppLa.repository;

import com.example.MapppLa.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}