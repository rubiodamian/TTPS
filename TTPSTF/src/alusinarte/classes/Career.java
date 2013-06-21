package alusinarte.classes;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Career {
	@Id 
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany(mappedBy = "career")
		private Collection<User> users;
	
	
	@Override
	public String toString() {
		return "Career [id=" + id + ", name=" + name + "]";
	}
	
	public Career(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
