package ru.gvozdev.emotrack.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gvozdev.emotrack.dto.EventDto;
import ru.gvozdev.emotrack.dto.UserDto;
import ru.gvozdev.emotrack.service.EventService;
import ru.gvozdev.emotrack.service.UserService;

@RestController
@AllArgsConstructor
@RequestMapping("/event")
public class EventController {

    private EventService EventService;


    @PostMapping("/create")
    public ResponseEntity<?> createEvent(@RequestBody EventDto EventDto){
        return ResponseEntity.ok(EventService.createEvent(EventDto));
    }

    @GetMapping("/{eventId}")
    public ResponseEntity<?> getEvent(@PathVariable Long eventId){
        return ResponseEntity.ok(EventService.getEvent(eventId));
    }
}
