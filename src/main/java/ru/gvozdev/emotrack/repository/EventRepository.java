package ru.gvozdev.emotrack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gvozdev.emotrack.entity.EventEntity;

@Repository
public interface EventRepository extends CrudRepository<EventEntity, Long> {
}
