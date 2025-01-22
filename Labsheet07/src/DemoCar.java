
public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		System.out.println("Company Name: "+car.getCompanyName());
		System.out.println("Model Name: "+car.getmodelName());
		System.out.println("Year: "+car.getyear());
		System.out.println("Mileage: "+car.getmileage());
		System.out.println();
		System.out.println("Updated car Details:");
		Car carupdata = new Car("Toyota","Corolla",2015,1);
		System.out.println("Company Name: "+carupdata.getCompanyName());
		System.out.println("Model Name: "+carupdata.getmodelName());
		System.out.println("Year: "+carupdata.getyear());
		carupdata.setyear(0);
		carupdata.setmodelName(null);
		

	}

}
