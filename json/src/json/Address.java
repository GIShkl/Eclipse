package json;

public class Address {
	private String homeAdress;
	private String schoolAdress;
	
	public Address() {
		
	} 
	
	public Address(String homeAdress, String schoolAdress) {
		super();
		this.homeAdress = homeAdress;
		this.schoolAdress = schoolAdress;
	}

	public String getHomeAdress() {
		return homeAdress;
	}
	public void setHomeAdress(String homeAdress) {
		this.homeAdress = homeAdress;
	}
	public String getSchoolAdress() {
		return schoolAdress;
	}
	
	public void setSchoolAdress(String schoolAdress) {
		this.schoolAdress = schoolAdress;
	}

}
