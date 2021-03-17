package dev.rev.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.google.gson.Gson;

import dev.rev.services.EventService;

@AutoConfigureMockMvc
@SpringBootTest(classes = dev.rev.demo.TaskAssessApplication.class)
public class EventControllerTest {

	@MockBean
	EventService es;
	
	@Autowired
	MockMvc mvc;
	
	static Gson gson = new Gson();
	
	@Test
	void testMethod() {
		
	}
}
