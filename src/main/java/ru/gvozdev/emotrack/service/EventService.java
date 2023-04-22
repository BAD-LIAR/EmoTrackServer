package ru.gvozdev.emotrack.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gvozdev.emotrack.dto.EventDto;
import ru.gvozdev.emotrack.entity.EventEntity;
import ru.gvozdev.emotrack.mapper.EventMapper;
import ru.gvozdev.emotrack.repository.EventRepository;

import java.awt.*;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository EventRepository;
    private final EventMapper EventMapper;

    public EventEntity createEvent(EventDto EventDto){
        return EventRepository.save(EventMapper.EventDtoToEventEntity(EventDto));
    }

    public EventDto getEvent(Long EventId){
        EventEntity EventEntity = EventRepository.findById(EventId).orElseThrow(IllegalArgumentException::new);
        return EventMapper.EventEntityToEventDto(EventEntity);
    }
}
