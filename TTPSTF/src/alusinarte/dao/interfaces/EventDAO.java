package alusinarte.dao.interfaces;

import java.util.ArrayList;
import java.util.Map;

import alusinarte.classes.Event;

public interface EventDAO {
	
	public void addEvent(Event evt);
	
	public ArrayList<Event> getEvents();

}
