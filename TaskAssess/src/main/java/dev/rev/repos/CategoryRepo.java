package dev.rev.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.rev.beans.Category;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
	
	public Category findByCategory(String category);
	public List<Category> findByColor(String color);
}
