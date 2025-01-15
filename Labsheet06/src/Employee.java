
public class Employee {
	//private attribute
	private String name;
	private int hourworked;
	private double hourlyRate;
	
	//Method to set employee detail
	public void setEmployeebetails(String empName , int hour , double rate) {
		name = empName;
		hourworked = hour;
		hourlyRate = rate;
	}
	
	//Method to calculate salary
	public double calculateSalary() {
		double salary = hourworked * hourlyRate;
		if(hourworked > 40) {
			double bonus = salary * 0.10;//bonus is 10% of salary
			salary +=bonus;
		}
		return salary;
	}
	//Method to display employee detail
	public void displayEmployeedetail() {
		System.out.println("Name "+ name);
		System.out.println("Hour worked "+ hourworked);
		System.out.println("Hourly Rate "+ hourlyRate);
		System.out.println("Total Salary "+ calculateSalary());
	}

}
