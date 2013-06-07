package clasesDelSistema;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;

@PersistenceContext(name="alusinarte")
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue
	
	private int id;
	private String usuario;
	private String pass;
	private String nombre;
	private String apellido;
	private String mail;
	private String sexo;
	private String fecNac;
	private String ocupacion;
	private String carrera;
	
	public Usuario(String usr, String passw, String nom, String ape, String mail, String sexo, String fec, String ocu, String car){
		this.setUsuario(usr);
		this.setPass(passw);
		this.setNombre(nom);
		this.setApellido(ape);
		this.setMail(mail);
		this.setSexo(sexo);
		this.setFecNac(fec);
		this.setOcupacion(ocu);
		this.setCarrera(car);
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFecNac() {
		return fecNac;
	}
	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}



