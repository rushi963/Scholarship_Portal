package webPortal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FundingOrganization {
	
	private String name;
	ArrayList<Scholarship> s_list;
	ArrayList<ScholarshipApplication> sa_list;
//	Map<String,Double> students = new HashMap<String,Double>();
	
	public FundingOrganization(String name){
		s_list = new ArrayList<Scholarship>();
		sa_list = new ArrayList<ScholarshipApplication>();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public void addScholarship(Scholarship s){
		s_list.add(s);
	}


	public void addScholarshipApp(ScholarshipApplication sa){
		sa_list.add(sa);
	}

	public ArrayList<String> selectStudents(String scholarshipName, int number)
	{
	/*	for (ScholarshipApplication l:a_list){
			if(l.scholarship_name.equalsIgnoreCase(scholarshipName))
			{
				students.put(l.st_name, l.cpi);
			}
		}
	*/
/*		Set<Entry<String, Double>> set = students.entrySet();
        List<Entry<String, Double>> list = new ArrayList<Entry<String, Double>>(set);
 
		Collections.sort( list, new Comparator<Map.Entry<String, Double>>()
        {
            public int compare( Map.Entry<String, Double> o1, Map.Entry<String, Double> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
 */
		
		ArrayList<ScholarshipApplication> tempList = new ArrayList<>();
		
		for (ScholarshipApplication s:sa_list){
			if(s.scholarship_name.equalsIgnoreCase(scholarshipName))
			{
				tempList.add(s);
			}
		}
		Collections.sort(tempList, new Comparator<ScholarshipApplication>(){
			public int compare(ScholarshipApplication sa1, ScholarshipApplication sa2){
				double cpi1 = sa1.getCpi();
				double cpi2 = sa2.getCpi();
				
				if(cpi1>cpi2)
					return 1;
				else if(cpi1==cpi2)
					return 0;
				else
					return -1;
						
			}
		});
		
        ArrayList<String> array= new ArrayList<String>();
        int i = 0;
        for(ScholarshipApplication sa:tempList){
            if(i<number)
            {
            	array.add(sa.getSt_name());
//        		System.out.println(sa.getSt_name());
            	
            }
            i++;
        }
        
        return array;
    }
	
	public void notifyStudents(ArrayList<String> selected)
	{
//		System.out.println(sa_list.size());
		System.out.println("The following students are notified");
		for(String list: selected)
		{
			System.out.println(list);
		}
	}
}
