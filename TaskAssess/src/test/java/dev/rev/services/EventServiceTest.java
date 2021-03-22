package dev.rev.services;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import dev.rev.beans.Category;
import dev.rev.beans.Event;
import dev.rev.beans.User;
import dev.rev.repos.EventRepo;

@SpringBootTest(classes = dev.rev.demo.TaskAssessApplication.class)
public class EventServiceTest {
	
	@MockBean
	EventRepo er;
	
	@Autowired
	EventService es;
	
	@Test
	void testMethod() {
		
	}
	
	@Test
	void getEvent() {
		
	}
	
	@Test
	void getAllEvents() {
		
	}

	@Test
	void getEventsByUser() {
		
	}
	
	@Test
	void addEvent() {
//		Category testCat = new Category();
//		User user = new User();
//		Timestamp startTime = Timestamp.valueOf("2021-03-23 9:00:00.0");
//		Timestamp endTime = Timestamp.valueOf("2021-03-23 10:00:00.0");
//		Event e = new Event();
//		Event eventTest = new Event();
//		
//		
//		
//		
//		eventTest.setId(1);
//		eventTest.setTitle("title");
//		eventTest.setContent("content");
//		eventTest.setStart(startTime);
//		eventTest.setEnd(endTime);
//		eventTest.setCategory(testCat);
//		eventTest.setUser(user);
//	
	}
	
	@Test
	void updateEvent() {
		
	}
	
	@Test
	void deleteEvent() {
		
	}

}
