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
	public Map<Long,String> getEvents() {
		EntityManager em=Emf.getEmf().createEntityManager();
		String query = "SELECT e FROM Event e";
		Query sqlQuery = em.createQuery(query);
		
		ArrayList<Event> result = new ArrayList<Event>();
		Map<Long,String> map = new HashMap<Long, String>();
		try{
			result = (ArrayList<Event>) sqlQuery.getResultList();	
			Iterator<Event> i=result.iterator();
			while(i.hasNext()){
				Event evt=(Event) i.next();
				map.put(evt.getId(),evt.getTitle());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		em.close();
		return map;
	}
	
	//RECUPERA UN DETERMINADO EVENTO DE LA BASE DE DATOS
	
	@Override
	public Event getEvent(long id) {
		EntityManager em=Emf.getEmf().createEntityManager();
		String query = "FROM Event WHERE id= :identificador";
		Query sqlQuery = em.createQuery(query).setParameter("identificador", id);
		Event resul=null;	
		try{
			resul=(Event)sqlQuery.getSingleResult();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		em.close();
		return resul;
	}
	

	//ELIMINA UN EVENTO DE LA BASE DE DATOS
	
	public void delEvent(long id){
		EntityManager em=Emf.getEmf().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		String query = "DELETE Event WHERE id= :identificador";
		Query sqlQuery = em.createQuery(query).setParameter("identificador", id);
		etx.begin();
		try{
			sqlQuery.executeUpdate();
			}	
		catch(Exception e){
			e.printStackTrace();
		}
		em.flush();
		etx.commit();
		em.close();
	
	}

	//MODIFICA UN EVENTO EN LA BASE DE DATOS
	
	@Override
	public void modEvent(Event evt, long id) {
		EntityManager em=Emf.getEmf().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		String query = "UPDATE Event e set e.title= :titulo, e.description= :descripcion, e.day= :dia, e.hour= :hora, e.place= :lugar, e.category= :categoria WHERE id= :identificador";
		Query sqlQuery = em.createQuery(query);
		sqlQuery.setParameter("identificador", id);
		sqlQuery.setParameter("titulo", evt.getTitle());
		sqlQuery.setParameter("descripcion", evt.getDescription());
		sqlQuery.setParameter("dia", evt.getDay());
		sqlQuery.setParameter("hora", evt.getHour());
		sqlQuery.setParameter("lugar", evt.getPlace());
		sqlQuery.setParameter("categoria", evt.getCategory());
		etx.begin();
		try{
			sqlQuery.executeUpdate();
			}	
		catch(Exception e){
			e.printStackTrace();
		}
		em.flush();
		etx.commit();
		em.close();
	}


}

