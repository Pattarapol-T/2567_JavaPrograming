
public class Car {
	private String CompanyName;
	private String modelName;
	private int    year;
	private double mileage;
	Car(){
		CompanyName = "Unknown";
		modelName = "Unknown";
		year = 2000;
		mileage = 0.0;
		
		
	}
	
	Car(String CompanyName, String modelName, int year, double mileage) {
		this.CompanyName = CompanyName;
		this.modelName = modelName;
		this.year = year >= 1886? year:2000;
		this.mileage = mileage;
	
		
	}
	public String getCompanyName() {
		return this.CompanyName;
	}
	public void setCompanyName(String companyName) {
		if(CompanyName != null && !CompanyName.trim().isEmpty()) {
		}
		else {
			System.out.println("Error: Invalid company or model name!");
		}
		
	}
	public String getmodelName() {
		return modelName;
	}
	public void setmodelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}
		else {
			System.out.println("Error: Invalid company or model name!"
);
		}
	}
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		if(this.year < 1886) {
			this.year = year;
		}else if(this.year >= 1886) {
			System.out.println("Error: Invalid year!");
		}
	}
	public double getmileage() {
		return mileage;
	}
}
