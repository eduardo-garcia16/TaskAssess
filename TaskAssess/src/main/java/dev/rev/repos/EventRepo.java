package dev.rev.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.rev.beans.Event;

@Repository
public interface EventRepo extends CrudRepository<Event, Integer> {

	
}
