package dev.rev.repos;

import org.springframework.data.repository.CrudRepository;

import dev.rev.beans.Event;

public interface EventRepo extends CrudRepository<Event, Integer> {

}
