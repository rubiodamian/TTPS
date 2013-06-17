package alusinarte.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import alusinarte.classes.User;
import alusinarte.dao.impl.hibernate.FactoryDAOHibernate;
import alusinarte.dao.impl.hibernate.UserDAOHibernate;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "SingUpAction")
@Results({ @Result(name = "success", location = "/index.jsp"),
		@Result(name = "input", location = "/singup.jsp") })
public class SingUpAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String name;
	private String lastname;
	private String email;
	private String gender;
	private String occupation;
	private String career;

	public String execute() {
		UserDAOHibernate userDAO = (UserDAOHibernate) FactoryDAOHibernate.getUser();
		User user = new User(this.getUsername(), this.getPassword(), this.getName(), this.getLastname(), this.getEmail(), this.getGender(), this.getOccupation(), this.getCareer());
		userDAO.addUser(user);
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
	
	public void validate() {
		if (this.getName().equals("") || this.getLastname().equals("")
				|| getEmail().equals("") || this.getPassword().equals("")) {
			this.addFieldError("error", "Debe completar todos los campos");
		} else {
			if (FactoryDAOHibernate.getUser().userExist(this.getUsername())) {
				this.addFieldError("error", "El usuario ingrsado ya existe");
			}
		}
	}


}
