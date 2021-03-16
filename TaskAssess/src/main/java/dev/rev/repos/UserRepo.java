package dev.rev.repos;

import org.springframework.data.repository.CrudRepository;

import dev.rev.beans.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
