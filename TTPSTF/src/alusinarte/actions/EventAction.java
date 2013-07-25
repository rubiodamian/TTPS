package alusinarte.actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;



import alusinarte.dao.impl.hibernate.FactoryDAOHibernate;
import alusinarte.dao.impl.hibernate.EventDAOHibernate;
import alusinarte.classes.Event;



public class EventAction extends ActionSupport implements ModelDriven<Event> {

	private static final long serialVersionUID = 1L;

	private ArrayList<Event> eventos;
	private Event event=new Event();
	private EventDAOHibernate eventDAO= new EventDAOHibernate();
	
	@Override
	public Event getModel() {
		return event;
	}
	
//	MENSAJES PARA AGREGAR EVENTOS
	
	@Action(value = "addEventView", 
		    results = {@Result(name="success", location="/addEvent.jsp")})	

	public String addView(){
		return SUCCESS;
	}

	@Action(value="addEvent", 
		    results={@Result(name="success", location="/index.jsp"),
					@Result(name = "input", location = "/addEvent.jsp") }
		  )	
	public String add() {
		this.eventDAO = (EventDAOHibernate) FactoryDAOHibernate.getEvent();
		this.eventDAO.addEvent(this.getModel());
		return SUCCESS;
	}
	
//MENSAJES PARA MODIFICAR EVENTOS

	@Action(value="modEventView", 
		    results={@Result(name="success", location="/modEvent.jsp")}
		  )	
	public String modView(){
		this.eventDAO = (EventDAOHibernate) FactoryDAOHibernate.getEvent();
		eventos=this.eventDAO.getEvents();
		return SUCCESS;
	}
	
	public ArrayList<Event> getEventos(){
		return eventos;
	}
	
	@Action(value="modEvent", 
		    results={@Result(name="success", location="/index.jsp"),
					@Result(name = "input", location = "/modEvent.jsp") }
		  )	
	public String mod(){
		return SUCCESS;
	}
	
	
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public EventDAOHibernate getEventDAO() {
		return eventDAO;
	}

	public void setEventDAO(EventDAOHibernate eventDAO) {
		this.eventDAO = eventDAO;
	}
	
	
	



	
	
	
}
