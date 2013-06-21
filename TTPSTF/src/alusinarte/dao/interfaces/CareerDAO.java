package alusinarte.dao.interfaces;

import java.util.List;

import alusinarte.classes.Career;

public interface CareerDAO {
	
	public List<Career> careers();
	public void addCareer(Career career);

}
