package dev.rev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.rev.beans.User;
import dev.rev.services.UserService;
@RestController
@CrossOrigin
public class UserControllerImpl implements UserController {

	@Autowired
	private UserService uservice;
	
	@Override
	@PostMapping(value = "/users", consumes = "application/json", produces = "application/json")
	public User addUser(@RequestBody User user) {
		try {
			return uservice.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@GetMapping(value = "/users/{id}")
	public User getUser(@PathVariable("id") int id) {
		try {
			return uservice.getUser(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@GetMapping(value = "/users")
	public List<User> getAllUsers() {
		try {
			return uservice.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@PutMapping(value = "/users/{id}", consumes = "application/json")
	public User updateUser(@PathVariable("id") int id, User user) {
		try {
			user.setId(id);
			return uservice.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@DeleteMapping(value = "/users/{id}")
	public boolean deleteUser(@PathVariable("id") int id) {
		
		try {
			return uservice.deleteUser(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@PostMapping(value = "getByEmail", consumes = "application/json", produces = "application/json")
	public User getUserByEmail(@RequestBody User u) {
		try {
			User user = uservice.getUserByEmail(u.getEmail());
			
			if (user != null) {
				//if email exists in the database, check password
				System.out.println("PW in DB: " + user.getPassword());
				System.out.println("PW in RequestBody: " + u.getPassword());
				
				if(user.getPassword().equals(u.getPassword())) {
					
					return u;			
				}
				return null;
				
			}
			return null;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
