package alusinarte.dao.impl.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import alusinarte.classes.User;
import alusinarte.dao.interfaces.UserDAO;
import alusinarte.persistence.Emf;


public class UserDAOHibernate implements UserDAO{

	@Override
	public Boolean userExist(String username) {
		EntityManager em = Emf.getEmf().createEntityManager();
		String query = "FROM User WHERE username = :username";
		Query sqlQuery = em.createQuery(query).setParameter("username",
				username);
		User user = null;
		try {
			user =  (User) sqlQuery.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user != null;
	}

	@Override
	public User findUser(String username, String password) {
		EntityManager em = Emf.getEmf().createEntityManager();
		String query = "FROM Usuario WHERE username = :username AND password = :password";
		Query sqlQuery = em.createQuery(query)
				.setParameter("username", username)
				.setParameter("password", password);

		User result = null;
		try {
			result = (User) sqlQuery.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void addUser(User user) {
		EntityManager em = Emf.getEmf().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		em.persist(user);
		em.flush();
		etx.commit();
		em.close();

	}
}