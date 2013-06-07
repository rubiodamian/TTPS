package emf;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class emf {
	
	
	public static EntityManagerFactory getEmf(){
		EntityManagerFactory emfInstance=Persistence.createEntityManagerFactory("alusinarte");
		return emfInstance;
	}

}
