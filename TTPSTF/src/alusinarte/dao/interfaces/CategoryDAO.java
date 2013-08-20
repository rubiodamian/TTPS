package alusinarte.dao.interfaces;

import java.util.Map;

import alusinarte.classes.Category;

public interface CategoryDAO {
	
	public void addCategory(Category cat);
	
	public Map getCategories();
	
	public Category getCategory(long id);
	
	public void delCategory(long id);
	
	public void modCategory(Category cat, long id);

}
