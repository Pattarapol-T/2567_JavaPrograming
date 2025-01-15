import java.util.*;
public class NewtestEmployeeinput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// create two Employee details
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//Display data for first employee
		System.out.println("Enter details for Employee 1: ");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hour Worked; ");
		int empHourWorked = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate1 = scan.nextDouble();
		
		emp1.setEmployeebetails(empName1, empHourWorked, empHourlyRate1);
		Line('-');
		emp1.displayEmployeedetail();
		Line('*');
		
		scan.nextLine();
		
		System.out.println("Enter details for Employee 1: ");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hour Worked; ");
		int emp2HourWorked = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double emp2HourlyRate1 = scan.nextDouble();
		
		emp1.setEmployeebetails(empName2, emp2HourWorked, emp2HourlyRate1);
		Line('-');
		emp2.displayEmployeedetail();
		Line('*');
		
		
		
		
		scan.close();
	}
	//Line Mothod
	public static void Line(char symbo) {
		//System.out.println("---------------------------");
		for(int i=1; i<50;i++) {
			System.out.print(symbo);
		}
	}

}
