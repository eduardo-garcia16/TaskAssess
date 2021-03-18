package dev.rev.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

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

}
