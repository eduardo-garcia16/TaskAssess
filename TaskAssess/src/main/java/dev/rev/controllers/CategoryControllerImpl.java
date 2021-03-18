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

import dev.rev.beans.Category;
import dev.rev.services.CategoryService;

@RestController
@CrossOrigin
public class CategoryControllerImpl implements CategoryController {

	@Autowired
	private CategoryService catser;

	@Override
	@PostMapping(value = "/categories", consumes = "application/json", produces = "application/json")
	public Category addCategory(@RequestBody Category category) {
		try {
			return catser.addCategory(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@GetMapping(value = "/categories/{id}")
	public Category getCategory(int id) {
		try {
			return catser.getCategory(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@GetMapping(value = "/categories")
	public List<Category> getAllCategories() {
		try {
			return catser.getAllCategories();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@PutMapping(value = "/categories/{id}", consumes = "application/json")
	public Category updateCategory(@PathVariable int id, Category category) {
		try {
			category.setId(id);
			return catser.updateCategory(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@DeleteMapping(value = "/category/{id}")
	public boolean deleteCategory(int id) {
		try {
			return catser.deleteCategory(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@PostMapping(value = "/getByCategory", consumes = "application/json", produces = "application/json")
	public Category getCategoryByName(@RequestBody Category category) {
		try {
			Category cat = catser.getCategoryByName(category.getName());
			if (cat != null) {
				return cat;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@GetMapping(value = "/getByColor/{color}")
	public List<Category> getCategoriesByColor(@PathVariable("color") String color) {
		try {
			return catser.getCategoryByColor(color);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
