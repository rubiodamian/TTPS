package alusinarte.dao.interfaces;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import alusinarte.classes.Career;

public interface CareerDAO {
	
	public Map<Long, String> careers();
	public void addCareer(Career career);

}
