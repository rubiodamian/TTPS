package alusinarte.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import alusinarte.classes.User;
import alusinarte.dao.impl.hibernate.UserDAOHibernate;
import alusinarte.dao.impl.hibernate.CareerDAOHibernate;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = -6659925652584240539L;

	private User user = new User();
	private UserDAOHibernate userDAO = new UserDAOHibernate();
	private CareerDAOHibernate careerDAO = new CareerDAOHibernate();
	
	@Override
	public User getModel() {
		return user;
	}
	 @Action(value="addUser", 
	    results={@Result(name="success", location="/index.jsp"),
				@Result(name = "input", location = "/singup.jsp") }
	  )
	public String add()
	{
//		System.out.println(this.getCareerDAO().careers().get(0).getName());
//		this.getUserDAO().addUser(this.getUser());
		return SUCCESS;
	}
		
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CareerDAOHibernate getCareerDAO() {
		return careerDAO;
	}

	public void setCareerDAO(CareerDAOHibernate careerDAO) {
		this.careerDAO = careerDAO;
	}
	public UserDAOHibernate getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAOHibernate userDAO) {
		this.userDAO = userDAO;
	}


}