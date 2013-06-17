package alusinarte.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emf {
	
	
	public static EntityManagerFactory getEmf(){
		EntityManagerFactory emfInstance=Persistence.createEntityManagerFactory("alusinarte");
		return emfInstance;
	}

}
