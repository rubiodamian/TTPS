package alusinarte.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

@PersistenceContext(name = "alusinarte")
@Entity
@Table(name="USER")
public class User {

	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="name")
	private String name;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String email;
	@Column(name="gender")
	private String gender;
	@Column(name="occupation")
	private String occupation;
	@Column(name="career")
	private String career;
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", name=" + name + ", lastname=" + lastname + ", email="
				+ email + ", gender=" + gender + ", occupation=" + occupation
				+ ", career=" + career + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getName()="
				+ getName() + ", getLastname()=" + getLastname()
				+ ", getEmail()=" + getEmail() + ", getGender()=" + getGender()
				+ ", getOccupation()=" + getOccupation() + ", getCareer()="
				+ getCareer() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public User(String username, String password, String name, String lastname,
			String email, String gender, String occupation, String career) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.occupation = occupation;
		this.career = career;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}

	
}
