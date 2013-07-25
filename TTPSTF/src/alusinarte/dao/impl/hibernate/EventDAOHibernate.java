package alusinarte.dao.impl.hibernate;

import java.util.ArrayList;

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
	public ArrayList<String> getEvents() {
		EntityManager em=Emf.getEmf().createEntityManager();
		String query = "SELECT title FROM Event";
		Query sqlQuery = em.createQuery(query);
		
		ArrayList<String> result = null;
		try{
			result = (ArrayList<String>) sqlQuery.getResultList();			
		}catch(Exception e){
			e.printStackTrace();
		}
		em.close();
		return result;
	}

}
