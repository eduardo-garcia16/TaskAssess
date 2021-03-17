package dev.rev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.rev.beans.User;
import dev.rev.repos.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo ur;
	
	@Override
	public User getUser(int id) {
		try {
			return ur.findById(id).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public User getUserByEmail(String email) {
		try {
			return ur.findByEmail(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		try {
			return (List<User>) ur.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		try {
			return ur.findByEmailAndPassword(email, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User addUser(User u) {
		try {
			return ur.save(u);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User updateUser(User u) {
		try {
			return ur.save(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteUser(int id) {
		try {
			ur.delete(ur.findById(id).get());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
}
