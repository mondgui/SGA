package com.example.MapppLa.controller;

import com.example.MapppLa.model.Event;
import com.example.MapppLa.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"/","/events"})
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping()
    public String getAllEvents(Model model) {
        List<Event> events = eventService.getAllEvents();
        model.addAttribute("events", events);
        return "events";
    }

    @GetMapping("/create")
    public String createEventForm(Model model) {
        model.addAttribute("event", new Event());
        return "create_event";
    }

    @PostMapping("/create")
    public String createEvent(@ModelAttribute Event event) {
        eventService.saveEvent(event);
        return "redirect:/events";
    }

    @GetMapping("/edit/{id}")
    public String editEventForm(@PathVariable Long id, Model model) {
        Event event = eventService.getAllEvents().stream().filter(e -> e.getEventId().equals(id)).findFirst().orElse(null);
        model.addAttribute("event", event);
        return "edit_event";
    }

    @PostMapping("/edit/{id}")
    public String updateEvent(@PathVariable Long id, @ModelAttribute Event event) {
        eventService.updateEvent(event);
        return "redirect:/events";
    }

    @GetMapping("/delete/{id}")
    public String deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
        return "redirect:/events";
    }
}