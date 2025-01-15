
public class testEmployee {

	public static void main(String[] args) {
		// create two Employee object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		// set Employee detail
		emp1.setEmployeebetails("Natcha",45,20.0);
		emp2.setEmployeebetails("Attakorn",38,25.0);
		
		//Display employee details
		System.out.println("Employee 1 Details");
		emp1.displayEmployeedetail();
		
		System.out.println("\nEmployee 2 Details");
		emp2.displayEmployeedetail();

	}

}
