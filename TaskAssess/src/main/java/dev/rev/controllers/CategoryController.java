package dev.rev.controllers;

import java.util.List;

import dev.rev.beans.Category;

public interface CategoryController {
	/**
	 * <p>
	 * <h1>addCategory</h1> is a post mapping that will transform an inputted JSON
	 * object into a Category object then send it to the service layer to be added
	 * to the database
	 * </p>
	 * 
	 * @param category received in the response body of the post request
	 * @return <strong>Category</strong> Returns a Category object in the form of a
	 *         JSON to the front end, Returns null if Category was not successfully
	 *         added to DB
	 * 
	 * @author Revature 2101 ETL batch
	 */
	public Category addCategory(Category category);

	/**
	 * <p>
	 * <h1>getCategory</h1> is a get mapping that will retrieve a specified Category
	 * based on a given Category ID and return the retrieved Category as a JSON to
	 * the front end
	 * </p>
	 * 
	 * @param id path variable of type int
	 * @return <strong>Category</strong> Returns a Category object in the form of a
	 *         JSON to the front end, Returns null if Category was not successfully
	 *         added to DB
	 * @author Revature 2101 ETL batch
	 */
	public Category getCategory(int id);

	/**
	 * <p>
	 * <h1>getAllCategorys</h1> is a get mapping that will retrieve all Categorys
	 * from the database and send it all to the front end in the form of a JSON
	 * </p>
	 * 
	 * @return List
	 * @author Revature 2101 ETL batch
	 */
	public List<Category> getAllCategories();

	/**
	 * <p>
	 * <h1>updateCategory</h1> is a put mapping that will update an existing
	 * Category with the given Category where the Category ID is the ID supplied by
	 * our path variable
	 * </p>
	 * 
	 * @param id       path variable of a Category's ID
	 * @param category given in the request body, received as JSON and data used to
	 *                 populate a Category object
	 * @return <strong>Category</strong>
	 * @author Revature 2101 ETL batch
	 */
	public Category updateCategory(int id, Category category);

	/**
	 * <p>
	 * <h1>deleteCategory</h1> is a delete mapping that will delete an existing
	 * Category where the Category has the same ID as our path variable
	 * </p>
	 * 
	 * @param id path variable of a Category's ID
	 * @return <strong>Boolean</strong> true if Category deleted properly, false if
	 *         not
	 * @author Revature 2101 ETL batch
	 */
	public boolean deleteCategory(int id);

	/**
	 * <p>
	 * <h1>getCategoryByName</h1> is a get mapping that will retrieve a Category by
	 * their color passed in as a parameter
	 * </p>
	 * 
	 * @param email
	 * @return <strong>Category</strong>
	 * @author Revature 2101 ETL batch
	 */
	public Category getCategoryByName(Category category);
	
	public List<Category> getCategoriesByColor(String color);
}
