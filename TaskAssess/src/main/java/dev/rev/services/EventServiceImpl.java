package dev.rev.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.rev.beans.Event;
import dev.rev.repos.EventRepo;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	EventRepo er;

	@Override
	public Event getEvent(int id) {
		try {
			return er.findById(id).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Event> getAllEvents() {
		try {
			return (List<Event>) er.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Event> getEventsByUser(int userid) {
		List<Event> allEvents = getAllEvents();
		List<Event> events = new ArrayList<Event>();
		
		for(Event e : allEvents) {
			if(e.getUser().getId() == userid)
				events.add(e);
		}
		return events;
	}

	@Override
	public Event addEvent(Event e) {
		try {
			return er.save(e);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public Event updateEvent(Event e) {
		try {
			return er.save(e);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteEvent(int id) {
		try {
			er.delete(er.findById(id).get());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
