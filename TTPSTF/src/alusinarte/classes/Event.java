package alusinarte.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Event {
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String description;
	private String day;
	private String hour;
	private String place;
	private String category;
	
	public Event(String tit, String desc, String day, String hour, String place, String cat){
		this.setTitle(tit);
		this.setDescription(desc);
		this.setDay(day);
		this.setHour(hour);
		this.setPlace(place);
		this.setCategory(cat);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}
