package alusinarte.dao.impl.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import alusinarte.classes.Event;
import alusinarte.dao.interfaces.EventDAO;
import alusinarte.persistence.Emf;

public class EventDAOHibernate implements EventDAO{

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

}
