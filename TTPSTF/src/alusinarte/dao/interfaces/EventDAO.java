package alusinarte.dao.interfaces;

import java.util.ArrayList;

import alusinarte.classes.Event;

public interface EventDAO {
	
	public void addEvent(Event evt);
	
	public ArrayList<String> getEvents();

}
