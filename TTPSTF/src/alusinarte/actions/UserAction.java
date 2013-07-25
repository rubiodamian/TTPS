package alusinarte.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import alusinarte.classes.Career;
import alusinarte.classes.User;
import alusinarte.dao.impl.hibernate.EventDAOHibernate;
import alusinarte.dao.impl.hibernate.FactoryDAOHibernate;
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
		this.userDAO=(UserDAOHibernate) FactoryDAOHibernate.getUser();
		this.userDAO.addUser(this.getModel());

	@Action(value = "/users/singup", results = { @Result(name = "success", location = "/singup.jsp") })
	public String singUp() {
//		System.out.println(this.getCareerDAO().careers());
		for(Career career : this.getCareerDAO().careers()){
			System.out.println(career);
		}
		
		return SUCCESS;
	}

	@Action(value = "/users/adduser", results = {
			@Result(name = "success", location = "/singup.jsp"),
			@Result(name = "input", location = "/index.jsp") })
	public String add() {
		// System.out.println(this.getCareerDAO().careers().get(0).getName());
		// this.getUserDAO().addUser(this.getModel());
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