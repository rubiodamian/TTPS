package alusinarte.dao.impl.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;







import alusinarte.classes.Event;
import alusinarte.dao.interfaces.EventDAO;
import alusinarte.persistence.Emf;

public class EventDAOHibernate implements EventDAO{


// AGREGA UN EVENTO A LA BD
	@Override
	public void addEvent(Event evt) {
		EntityManager em = Emf.getEmf().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.persist(evt);
		em.flush();
		etx.commit();
		em.close();
	}

//RECUPERA LOS EVENTOS DE LA BD
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Event> getEvents() {
		EntityManager em=Emf.getEmf().createEntityManager();
		String query = "SELECT id,title FROM Event e";
		Query sqlQuery = em.createQuery(query);
		
		ArrayList<Event> result = null;
		Map<Long,String> map = new HashMap<Long, String>();
		try{
			result = (ArrayList<Event>) sqlQuery.getResultList();	
//			Iterator i=result.iterator();
//			while(i.hasNext()){
//				Event evt=(Event) i.next();
//				map.put(evt.getId(),evt.getTitle());
//			}
		}catch(Exception e){
			e.printStackTrace();
		}
		em.close();
		return result;
	}

}
