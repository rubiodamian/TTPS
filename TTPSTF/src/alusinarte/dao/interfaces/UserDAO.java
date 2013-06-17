package alusinarte.dao.interfaces;

import alusinarte.classes.User;

public interface UserDAO {
	
	
	public void addUser(User usr);

	public User findUser(String username, String password);

	public Boolean userExist(String username);

}
