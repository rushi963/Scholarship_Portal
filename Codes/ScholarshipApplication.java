package webPortal;

public class ScholarshipApplication {

	String st_name,scholarship_name,application_status,fundingOrg;
	double cpi;
	Portal p;
	
	
	public ScholarshipApplication(Portal p) {
		this.st_name = "";
		this.scholarship_name = "";
		this.application_status = "";
		this.cpi = 0.0;
		this.p = p;
		this.fundingOrg = "";
	}



	// needs to be completed
	public int fillForm(String st_name, String sc_name, Double cpi, String fundingOrg){
		this.st_name = st_name;
		this.scholarship_name = sc_name;
		this.cpi = cpi;
		this.fundingOrg = fundingOrg;
		
		boolean valid = p.checkSingleScholarship(st_name);
		
		if(valid){
			p.saveApp(this);
			return 1;
		}
		else{
			return 0;		//form not submitted
		}
	}



	public String getFundingOrg() {
		return fundingOrg;
	}



	public void setFundingOrg(String fundingOrg) {
		this.fundingOrg = fundingOrg;
	}



	public double getCpi() {
		return cpi;
	}



	public void setCpi(double cpi) {
		this.cpi = cpi;
	}



	public String getSt_name() {
		return st_name;
	}



	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}



	public String getScholarship_name() {
		return scholarship_name;
	}



	public void setScholarship_name(String scholarship_name) {
		this.scholarship_name = scholarship_name;
	}



	public String getApplication_status() {
		return application_status;
	}



	public void setApplication_status(String application_status) {
		this.application_status = application_status;
	}



	public Portal getP() {
		return p;
	}



	public void setP(Portal p) {
		this.p = p;
	}
	
	
	
	
}
