package com.fagerland.javaapi.repositories;

import com.fagerland.javaapi.models.TimeEntry;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TimeRepository extends CrudRepository<TimeEntry, Long> {
    List<TimeEntry> findAll();
    TimeEntry findFirstByOrderByStartAsc();
}
