package dev.rev.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import dev.rev.repos.CategoryRepo;

@SpringBootTest(classes = dev.rev.demo.TaskAssessApplication.class)
public class CategoryServiceTest {

	@MockBean
	CategoryRepo cr;
	
	@Autowired
	CategoryService cs;
	
	@Test
	void testMethod() {
		
	}
}
