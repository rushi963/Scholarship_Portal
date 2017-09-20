package webPortal;


public class Scholarship {

	private String name,funding_org,type,duration,deadline,amount;
	private String[] criterias;
	
	public Scholarship(String name, String funding_org){
		this.name = name;
		this.funding_org = funding_org;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFunding_org() {
		return funding_org;
	}
	public void setFunding_org(String funding_org) {
		this.funding_org = funding_org;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String[] getCriterias() {
		return criterias;
	}
	public void setCriterias(String[] criterias) {
		this.criterias = criterias;
	}
	
	
}
