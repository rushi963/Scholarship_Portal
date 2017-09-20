package webPortal;
import java.util.*;
import java.io.*;

public class Portal {

	ArrayList<Scholarship> s_list;
	ArrayList<FundingOrganization> fo_list;
	
	PrintWriter pw = new PrintWriter(System.out);
	Map<String,String> loginMap = new HashMap<String,String>();

	
	 Portal(){
		s_list = new ArrayList<Scholarship>();
		fo_list = new ArrayList<FundingOrganization>();
	 }
	
	public void addUser(String username, String password){
		//check if user name is available
		//to be done
		loginMap.put(username, password);
	}
	
	public FundingOrganization addFO(String name){
		FundingOrganization fo = new FundingOrganization(name);
		fo_list.add(fo);
		return fo;
	}
	
	public boolean authenticateUser(String username, String password){
		if(loginMap.get(username).equals(password))
			return true;
		else
			return false;
	}
	
	
	//needs to be completed
	public void showListOfScholarships(){
		int i=0;
		for (Scholarship s:s_list){
			pw.println("Scholarship no: " + (i++));
			pw.println("Name: " + s.getName());
	
		}
	}
	
	public void selectScholarship(int no){
		
		
	}
	
	
	//to be done
	private void showScholarshipDetails(int no){
		pw.println("details");		
	}
	
	public boolean checkSingleScholarship(String st_name){
		
		int scholarship_count = CollegeDB.checkStudentScholarship(st_name);
		
		return (scholarship_count==0);
		
	}
	
	public void saveApp(ScholarshipApplication sa){
		for(FundingOrganization fo : fo_list){
			if(fo.getName().equals(sa.fundingOrg))
				{
					fo.addScholarshipApp(sa);
					break;
				}
		}
	}
	
	
	
	
}
