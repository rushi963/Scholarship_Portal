package webPortal;
/* The commands to the portal can be given through this class. This class represents 
 * the actions of the actors - student, Funding organization.
 * */

import java.io.*;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args){
		Portal p1 = new Portal();
		PrintWriter pw = new PrintWriter(System.out);
		ArrayList<String> selected = new ArrayList<String>();
		
		/*add one user*/
		p1.addUser("omkar","123");
		p1.addUser("rushi","1234");
		p1.addUser("ram","1235");
		p1.addUser("raj","1236");
		p1.addUser("ravi","1237");
		
		Scholarship s1 = new Scholarship("s1","Trust1");
		Scholarship s2 = new Scholarship("s2","Trust1");
		
		ScholarshipApplication sa2 = new ScholarshipApplication(p1);
		ScholarshipApplication sa3 = new ScholarshipApplication(p1);
		ScholarshipApplication sa4 = new ScholarshipApplication(p1);
		ScholarshipApplication sa5 = new ScholarshipApplication(p1);
	
		sa2.fillForm("rushi", "s1", 8.5, "Trust1");
		sa3.fillForm("ram", "s2", 9.0, "Trust1");
		sa4.fillForm("raj", "s1", 7.0, "Trust1");
		sa5.fillForm("ravi", "s2", 7.5, "Trust1");

	
		boolean loginResult = p1.authenticateUser("omkar", "123");
		
		if (loginResult){
			
			p1.showListOfScholarships();
			p1.selectScholarship(1);
			
			Student s = new Student();
			
			ScholarshipApplication sa1 = new ScholarshipApplication(p1);
			sa1.fillForm("omkar", "s1", 9.5,"Trust1");
			
			
		}
		else{
			pw.println("Invalid credentials");
		}

		
		/*selection process by Funding organisation*/
		
		int numberToSelect = 2;
		FundingOrganization fo = p1.addFO("Trust1");
		fo.addScholarship(s1);
		fo.addScholarship(s2);
		selected = fo.selectStudents("s1",numberToSelect);
		fo.notifyStudents(selected);

		/*student requests for list of scholarships*/
		
		
	}
	
	
	
	
	
	
}
