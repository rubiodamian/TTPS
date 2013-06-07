package clasesDAOhiber;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import clasesDelSistema.Usuario;
import emf.emf;
import interfacesDAO.UsuarioDAO;

public class UsuarioDAOhiber implements UsuarioDAO{

	@Override
	public void registrar(Usuario usr) {
		EntityManager em=emf.getEmf().createEntityManager();
		EntityTransaction etx=em.getTransaction();
		etx.begin();
		em.persist(usr);
		em.flush();
		etx.commit();
		em.close();
	}

}
