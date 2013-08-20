package alusinarte.dao.interfaces;

import java.util.Map;

import alusinarte.classes.Event;

public interface EventDAO {
	
	public Event getEvent(long id);
	
	public void addEvent(Event evt);
	
	public Map getEvents();
	
	public void delEvent(long id);
	
	public void modEvent(Event evt, long id);

}
