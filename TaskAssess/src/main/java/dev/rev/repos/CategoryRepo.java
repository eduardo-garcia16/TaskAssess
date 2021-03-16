package dev.rev.repos;

import org.springframework.data.repository.CrudRepository;

import dev.rev.beans.Category;

public interface CategoryRepo extends CrudRepository<Category, Integer> {

}
