package dev.rev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.rev.beans.Category;
import dev.rev.repos.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepo crepo;

	@Override
	public Category getCategory(int id) {
		try {
			return crepo.findById(id).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Category> getCategoryByColor(String color) {
		try {
			return crepo.findByColor(color);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Category> getAllCategories() {
		try {
			return (List<Category>) crepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Category getCategoryByName(String category) {
		try {
			return crepo.findByName(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Category addCategory(Category category) {
		try {
			return crepo.save(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Category updateCategory(Category category) {
		try {
			return crepo.save(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteCategory(int id) {
		try {
			crepo.delete(crepo.findById(id).get());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
