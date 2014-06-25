package alusinarte.dao.impl.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
	public Map<Long,String> careers() {
		EntityManager em = Emf.getEmf().createEntityManager();
		String query = "SELECT c FROM Career c";
		Query sqlQuery = em.createQuery(query);

		List<Career> careers = new ArrayList<Career>();
		Map<Long,String> map = new HashMap<Long, String>();
		try {
			careers = sqlQuery.getResultList();			
			Iterator<Career> i = careers.iterator();
			while(i.hasNext()){
				Career c = i.next();
				map.put(c.getId(),c.getName());
				System.out.println(c.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return map;
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
