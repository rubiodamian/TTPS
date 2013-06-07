package actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

import clasesDAOhiber.FactoryDAO;
import clasesDAOhiber.UsuarioDAOhiber;
import clasesDelSistema.Usuario;




@Action(value="RegistrarAction")
@Results({
	@Result(name="success",location="/index.jsp"),
	@Result(name="input", location="/registrar.jsp")
})

public class RegistrarAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	public String execute(){
		FactoryDAO fdao= new FactoryDAO();
		UsuarioDAOhiber user=(UsuarioDAOhiber) fdao.getUsuario();
		//Usuario usr=new Usuario(getNombre()); 	
		return SUCCESS;
	}

}
