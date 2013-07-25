package alusinarte.dao.impl.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import alusinarte.classes.Career;
import alusinarte.classes.Event;
import alusinarte.dao.interfaces.CareerDAO;
import alusinarte.persistence.Emf;

public class CareerDAOHibernate implements CareerDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Career> careers() {
		EntityManager em = Emf.getEmf().createEntityManager();
		String query = "SELECT id,name FROM Career";
		Query sqlQuery = em.createNativeQuery(query);

		List<Career> careers = new ArrayList<Career>();
		try {
			careers = sqlQuery.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return careers;
	}
	@Override
	public void addCareer(Career career) {
		EntityManager em = Emf.getEmf().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.persist(career);
		em.flush();
		etx.commit();
		em.close();
	}

}
