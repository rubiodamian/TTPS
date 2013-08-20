package alusinarte.classes;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Category {
	@Id
	@GeneratedValue
	private long id;
	private String nombre;
	
	@OneToMany(mappedBy="category", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
		private Collection<Event> eventos;
	
	public Category(){
	}
	
	public Category(String nom){
		this.setNombre(nom);
		eventos=new ArrayList<Event>();
	}
	
	public long getId(){
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	public Collection<Event> getEvents(){
		return eventos;
	}
	
//	public void addEvent(Event evt){
//		if(!getEvents().contains(evt)){
//			getEvents().add(evt);
//			if(evt.getCategory()!=null){
//				evt.getCategory().getEvents().remove(evt);
//			}
//			evt.setCategory(this);
//		}
//	}
	

}
