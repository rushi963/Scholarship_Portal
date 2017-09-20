package webPortal;

import java.util.*;

/*This class models an external entity - college DB*/
public class CollegeDB {

	static Map<String,Integer> countMap = new HashMap<>();
	
	static{
		countMap.put("omkar", 1);
		countMap.put("rushi", 0);
		countMap.put("ram", 0);
		countMap.put("raj", 0);
		countMap.put("ravi", 0);
	}

	public static int checkStudentScholarship(String name){
		return countMap.get(name);
	}
	
}
