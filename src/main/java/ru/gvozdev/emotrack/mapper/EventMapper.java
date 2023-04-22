package ru.gvozdev.emotrack.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.gvozdev.emotrack.dto.EventDto;
import ru.gvozdev.emotrack.dto.UserDto;
import ru.gvozdev.emotrack.entity.EventEntity;
import ru.gvozdev.emotrack.entity.UserEntity;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface EventMapper {

    EventEntity EventDtoToEventEntity(EventDto userDto);

    EventDto EventEntityToEventDto(EventEntity userEntity);
}
