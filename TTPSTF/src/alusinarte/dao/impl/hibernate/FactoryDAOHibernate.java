package alusinarte.dao.impl.hibernate;

public class FactoryDAOHibernate {
	
	public static UserDAOHibernate getUser() {
		return new UserDAOHibernate();
	}
	
	public static EventDAOHibernate getEvent(){
		return new EventDAOHibernate();
	}

	public static CategoryDAOHibernate getCategory(){
		return new CategoryDAOHibernate();
	}
}
