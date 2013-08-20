package alusinarte.actions;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;







import alusinarte.dao.impl.hibernate.CategoryDAOHibernate;
import alusinarte.dao.impl.hibernate.FactoryDAOHibernate;
import alusinarte.dao.impl.hibernate.EventDAOHibernate;
import alusinarte.classes.Event;



public class EventAction extends ActionSupport implements ModelDriven<Event> {

	private static final long serialVersionUID = 1L;

	private Map eventos;
	private Event event=new Event();
	private EventDAOHibernate eventDAO= new EventDAOHibernate();
	private long evts;
	
	
	private CategoryDAOHibernate catDAO=new CategoryDAOHibernate();
	private Map categorias;
	private long categoria;
	
	@Override
	public Event getModel() {
		return event;
	}
	
//	MENSAJES PARA AGREGAR EVENTOS
	
	@Action(value = "addEventView", 
		    results = {@Result(name="success", location="/addEvent.jsp")})	

	public String addView(){
		this.catDAO = (CategoryDAOHibernate) FactoryDAOHibernate.getCategory();
		setCategorias(this.catDAO.getCategories());
		return SUCCESS;
	}

	@Action(value="addEvent", 
		    results={@Result(name="success", location="/index.jsp"),
					@Result(name = "input", location = "/addEvent.jsp") }
		  )	
	public String add() {
		this.eventDAO = (EventDAOHibernate) FactoryDAOHibernate.getEvent();
		this.catDAO = (CategoryDAOHibernate) FactoryDAOHibernate.getCategory();
		event=this.getModel();
		event.setCategory(catDAO.getCategory(getCategoria()));
		this.eventDAO.addEvent(event);
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
	
	@Action(value="modEvent", 
		    results={@Result(name="success", location="/modEventViewData.jsp")}
		  )	
	
	public String mod(){
		long id=getEvts();
		this.eventDAO = (EventDAOHibernate) FactoryDAOHibernate.getEvent();
		this.event=this.eventDAO.getEvent(id);
		this.catDAO = (CategoryDAOHibernate) FactoryDAOHibernate.getCategory();
		setCategorias(this.catDAO.getCategories());
		return SUCCESS;
	}
	private long idEvent;
	@Action(value="modEventData", 
		    results={@Result(name="success", location="/index.jsp")}
		  )	
	
	public String modificar(){
		this.eventDAO = (EventDAOHibernate) FactoryDAOHibernate.getEvent();
		event=this.getModel();
		event.setCategory(catDAO.getCategory(getCategoria()));
		this.eventDAO.modEvent(event,this.getIdEvent());
		return SUCCESS;
	}
	
	
	//MENSAJES PARA ELIMINAR EVENTOS
	
	@Action(value="delEventView", 
		    results={@Result(name="success", location="/delEvent.jsp")}
		  )	
	
	public String delView(){
		this.eventDAO = (EventDAOHibernate) FactoryDAOHibernate.getEvent();
		eventos=this.eventDAO.getEvents();
		return SUCCESS;
	}
	
	
	@Action(value="delEvent", 
		    results={@Result(name="success", location="/index.jsp"),
					@Result(name = "input", location = "/delEvent.jsp") }
		  )	
	
	
	public String del(){
		long id=getEvts();
		this.eventDAO = (EventDAOHibernate) FactoryDAOHibernate.getEvent();
		this.eventDAO.delEvent(id);
		return SUCCESS;
	}
	
	public Map<Long,String> getEventos(){
		return eventos;
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

	public long getEvts() {
		return evts;
	}
	
	public void setEvts(long evts) {
		this.evts = evts;
	}

	public long getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(long idEvent) {
		this.idEvent = idEvent;
	}

	public CategoryDAOHibernate getCatDAO() {
		return catDAO;
	}

	public void setCatDAO(CategoryDAOHibernate catDAO) {
		this.catDAO = catDAO;
	}

	public Map getCategorias() {
		return categorias;
	}

	public void setCategorias(Map categorias) {
		this.categorias = categorias;
	}

	public long getCategoria() {
		return categoria;
	}

	public void setCategoria(long categoria) {
		this.categoria = categoria;
	}
	
	
	



	
	
	
}
