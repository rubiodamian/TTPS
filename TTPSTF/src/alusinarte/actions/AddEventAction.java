package alusinarte.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;


import alusinarte.dao.impl.hibernate.FactoryDAOHibernate;
import alusinarte.dao.impl.hibernate.EventDAOHibernate;
import alusinarte.classes.Event;

@Action(value = "addEventAction")
@Results({ @Result(name = "success", location = "/index.jsp"),
		@Result(name = "input", location = "/addEvent.jsp") })

public class AddEventAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String title;
	private String description;
	private String day;
	private String hour;
	private String place;
	private String category;
	
	public String execute() {
		EventDAOHibernate evtDAO = (EventDAOHibernate) FactoryDAOHibernate.getEvent();
		Event evento = new Event(getTitle(),getDescription(),getDay(),getHour(),getPlace(),getCategory());
		evtDAO.addEvent(evento);
		return SUCCESS;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
