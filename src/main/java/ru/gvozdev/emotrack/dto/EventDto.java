package ru.gvozdev.emotrack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.gvozdev.emotrack.entity.UserEntity;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {

    private Long userId;
    private String tittle;
    private String description;
    private Long emotional_condition;
    private Date createDate;
}
