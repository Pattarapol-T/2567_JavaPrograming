import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double BASE_SALARY = 1000.0;
		// Declare constants
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be compute
		 while(true) {
			 System.out.print("Enter gross sales for the saleperson (or -1 to end): ");
			 sales = input.nextInt();
			 if(sales == SENTINEL ) {
				 break;
				 
			 }
			 salary = BASE_SALARY + (sales * COMMISSION_RATE);
			 System.out.printf("The saleperson's salary is : $.2f",salary);
		 }
		 System.out.println("BYE BYE");
		
		input.close();

	}

}
