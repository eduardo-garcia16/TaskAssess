package dev.rev.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.rev.beans.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{
	
	public User findByEmail(String email);
	public User findByEmailAndPassword(String email, String password);
}
