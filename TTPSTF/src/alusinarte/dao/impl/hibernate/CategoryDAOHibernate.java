package alusinarte.dao.impl.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import alusinarte.classes.Category;
import alusinarte.classes.Event;
import alusinarte.dao.interfaces.CategoryDAO;
import alusinarte.persistence.Emf;

public class CategoryDAOHibernate implements CategoryDAO {

	@Override
	public void addCategory(Category cat) {
		EntityManager em = Emf.getEmf().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.persist(cat);
		em.flush();
		etx.commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map getCategories() {
		EntityManager em=Emf.getEmf().createEntityManager();
		String query = "SELECT c FROM Category c";
		Query sqlQuery = em.createQuery(query);
			
		ArrayList<Category> result = new ArrayList<Category>();
		Map<Long,String> map = new HashMap<Long, String>();
		try{
			result = (ArrayList<Category>) sqlQuery.getResultList();	
			Iterator<Category> i=result.iterator();
			while(i.hasNext()){
				Category cat=(Category) i.next();
				map.put(cat.getId(),cat.getNombre());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		em.close();
		return map;
		
	}

	@Override
	public void delCategory(long id) {
		EntityManager em=Emf.getEmf().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		String query = "DELETE Category WHERE id= :identificador";
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

	@Override
	public void modCategory(Category cat, long id) {
		EntityManager em=Emf.getEmf().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		String query = "UPDATE Category c set c.nombre= :name WHERE id= :identificador";
		Query sqlQuery = em.createQuery(query);
		sqlQuery.setParameter("identificador", id);
		sqlQuery.setParameter("name", cat.getNombre());
		
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

	@Override
	public Category getCategory(long id) {
		EntityManager em=Emf.getEmf().createEntityManager();
		String query = "FROM Category WHERE id= :identificador";
		Query sqlQuery = em.createQuery(query).setParameter("identificador", id);
		Category resul=null;	
		try{
			resul=(Category)sqlQuery.getSingleResult();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		em.close();
		return resul;
	}

}
