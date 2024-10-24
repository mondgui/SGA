package com.example.MapppLa.controller;

import com.example.MapppLa.model.Attendee;
import com.example.MapppLa.service.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/attendees")
public class AttendeeController {

    @Autowired
    private AttendeeService attendeeService;

    @GetMapping("/")
    public String getAllAttendees(Model model) {
        List<Attendee> attendees = attendeeService.getAllAttendees();
        model.addAttribute("attendees", attendees);
        return "attendees";
    }

    @GetMapping("/create")
    public String createAttendeeForm(Model model) {
        model.addAttribute("attendee", new Attendee());
        return "create_attendee";
    }

    @PostMapping("/create")
    public String createAttendee(@ModelAttribute Attendee attendee) {
        attendeeService.saveAttendee(attendee);
        return "redirect:/attendees";
    }

    @GetMapping("/edit/{id}")
    public String editAttendeeForm(@PathVariable Long id, Model model) {
        Attendee attendee = attendeeService.getAllAttendees().stream().filter(a -> a.getAttendeeId().equals(id)).findFirst().orElse(null);
        model.addAttribute("attendee", attendee);
        return "edit_attendee";
    }

    @PostMapping("/edit/{id}")
    public String updateAttendee(@PathVariable Long id, @ModelAttribute Attendee attendee) {
        attendeeService.updateAttendee(attendee);
        return "redirect:/attendees";
    }

    @GetMapping("/delete/{id}")
    public String deleteAttendee(@PathVariable Long id) {
        attendeeService.deleteAttendee(id);
        return "redirect:/attendees";
    }
}