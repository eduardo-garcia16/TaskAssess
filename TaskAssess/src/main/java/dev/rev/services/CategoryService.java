package dev.rev.services;

import java.util.List;

import dev.rev.beans.Category;

public interface CategoryService {
	
	/**
	 * <p>
	 * <h1>getCategory</h1> will retrieve a specified category
	 * based on a given category id and return the retrieved category to the
	 * category controller
	 * </p>
	 * 
	 * @param id of type int
	 * @return <strong>category</strong> Returns a category object
	 *         to the controller, Returns null if category was not successfully retrieved
	 *         from DB
	 * @author Revature 2101 ETL batch
	 */
	public Category getCategory(int id);
	
	/**
	 * <p>
	 * <h1>getcategoryByEmail</h1> will retrieve a specified category
	 * based on a given category email and return the retrieved category as to the
	 * category controller
	 * </p>
	 * 
	 * @param email of type String
	 * @return <strong>category</strong> Returns a category object in
	 *         to the controller, Returns null if category was not successfully retrieved
	 *         from DB
	 * @author Revature 2101 ETL batch
	 */
	
	public List<Category> getCategoryByColor(String color);
	
	/**
	 * <p>
	 * <h1>getAllcategorys</h1> will retrieve all categorys object as a list from
	 * the database and send list to the category controller
	 * </p>
	 * 
	 * @param none
	 * @return <strong>List</strong> Returns a list of category objects
	 *         to the controller, Returns null if list was not successfully retrieved
	 *         from DB
	 * @author Revature 2101 ETL batch
	 */
	public List<Category> getAllCategories();
	
	

	

	public Category getCategoryByName(String category);
	
	/**
	 * <p>
	 * <h1>addcategory</h1> will accept an inputed category object then send it to the category repository
	 *  to be added to the database. Returns a category object to the controller,
	 * Returns null if Survey was not successfully added to DB
	 * </p>
	 * 
	 * @param category
	 * @return <strong>category</strong>
	 * @author Revature 2101 ETL batch
	 */
	
	public Category addCategory(Category category);
	
	/**
	 * <p>
	 * <h1>updatecategory</h1> will accept an inputed category object to be updated, then send it to the category repository
	 *  to be updated in the database. Returns a category object to the controller,
	 * Returns null if Survey was not successfully added to DB
	 * </p>
	 * 
	 * @param category
	 * @return <strong>category</strong>
	 * @author Revature 2101 ETL batch
	 */
	
	public Category updateCategory(Category category);
	
	/**
	 * <p>
	 * <h1>deletecategory</h1> will delete one category object from the DB where the category id is the same ID
	 * as the one provided in the parameter
	 * </p>
	 * 
	 * @param id of type int
	 * @return <strong>boolean</strong> true if category deleted properly, false if not
	 * @author Revature 2101 ETL batch
	 */
	public boolean deleteCategory(int id);
}
