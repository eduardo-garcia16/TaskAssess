package dev.rev.services;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import dev.rev.beans.User;
import dev.rev.repos.UserRepo;

@SpringBootTest(classes = dev.rev.demo.TaskAssessApplication.class)
public class UserServiceTest {
	
	@MockBean
	UserRepo ur;
	
	@Autowired
	UserService us;
	
	@Test
	void testMethod() {
		
	}
	
	@Test
	void addUser() {
		
		User user = new User();
		User userTest = new User();
		userTest.setId(1);
		userTest.setEmail("test@gmail.com");
		userTest.setPassword("password1");
		userTest.setFirstName("Jane");
		userTest.setLastName("Doe");
		
		Mockito.when(ur.save(userTest)).thenReturn(userTest);
		
		user= us.addUser(userTest);
		Assertions.assertEquals(1, userTest.getId());
	}
	
	@Test
	void updateUser() {
		
		User userTest = new User();
		userTest.setId(1);
		userTest.setEmail("test@gmail.com");
		userTest.setPassword("password1");
		userTest.setFirstName("Jane");
		userTest.setLastName("Doe");
		
		Mockito.when(ur.save(userTest)).thenReturn(userTest);
		
		Assertions.assertEquals("Jane", userTest.getFirstName());
		userTest.setFirstName("Jill");
		userTest = us.updateUser(userTest);
		Assertions.assertEquals("Jill", userTest.getFirstName());
		
	}
	
	@Test
	void deleteUser() {
		
		int id = 1;
		User userTest = new User();
		userTest.setId(id);
		userTest.setEmail("test@gmail.com");
		userTest.setPassword("password1");
		userTest.setFirstName("Jane");
		userTest.setLastName("Doe");
		
		Mockito.when(ur.findById(id)).thenReturn(Optional.of(userTest));
		Mockito.when(ur.findById(0)).thenThrow(IllegalArgumentException.class);
		
		Assertions.assertEquals(true, us.deleteUser(id));
		verify(ur,times(1)).delete(userTest);
		
		Assertions.assertEquals(false, us.deleteUser(0));
		
		
	}
	
	@Test
	void getUser() {
		
		int id = 1;
		User userTest = new User();
		userTest.setId(id);
		userTest.setEmail("test@gmail.com");
		userTest.setPassword("password1");
		userTest.setFirstName("Jane");
		userTest.setLastName("Doe");
		
	}
	
	@Test
	void getUserByEmail() {
		
		String email = "test@gmail.com";
		User user = new User();
		User userTest = new User();
		userTest.setId(1);
		userTest.setEmail("test@gmail.com");
		userTest.setPassword("password1");
		userTest.setFirstName("Jane");
		userTest.setLastName("Doe");
		
		Mockito.when(ur.findByEmail(email)).thenReturn(userTest);
		
		user=us.getUserByEmail(email);
		Assertions.assertEquals("test@gmail.com", userTest.getEmail());
		
	}
	
	@Test
	void getUserByEmailAndPassword() {
		
		String email = "test@gmail.com";
		String password = "password1";
		
		User user = new User();
		User userTest = new User();
		userTest.setId(1);
		userTest.setEmail("test@gmail.com");
		userTest.setPassword("password1");
		userTest.setFirstName("Jane");
		userTest.setLastName("Doe");
		
		Mockito.when(ur.findByEmailAndPassword(email, password)).thenReturn(userTest);
		
		user = us.getUserByEmailAndPassword(email, password);
		Assertions.assertEquals("test@gmail.com", userTest.getEmail());
		Assertions.assertEquals("password1", userTest.getPassword());
		
	}
	
	@Test
	void getAllUsers() {
		
		int userList = 3;
		List<User> allUsers = new ArrayList<User>();
		Mockito.when(ur.findAll()).thenReturn(Stream.of(new User(), new User(), new User()).collect(Collectors.toList()));
		
		allUsers = us.getAllUsers();
		Assertions.assertEquals(userList, allUsers.size());
	}
	
}
