package dev.rev.services;

import java.util.List;

import dev.rev.beans.Event;

public interface EventService {
		public Event getEvent(int id);
		
		public List<Event> getAllEvents();

		public List<Event> getEventsByUser(int userid);
		
		public Event addEvent(Event e);
		
		public Event updateEvent(Event e);
		
		public boolean deleteEvent(int id);
}
