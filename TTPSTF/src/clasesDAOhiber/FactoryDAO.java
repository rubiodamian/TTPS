package clasesDAOhiber;

import interfacesDAO.UsuarioDAO;



public class FactoryDAO {
	
	public static UsuarioDAO getUsuario(){
		return new UsuarioDAOhiber();
	}

}
