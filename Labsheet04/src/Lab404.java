import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		inputStudent();
	}
	
	public static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectID;
		boolean isstudentIDValid, isSubjectIDVaild;
		while(true) {
			
			// input student ID
			System.out.print("Enter Student Id: ");
			studentID = scanner.nextLine();
			
			// input subject code
			System.out.print("Enter Student Id: ");
			subjectID = scanner.nextLine();
			
			// Check langtha of student 10 and subject code
			isstudentIDValid = isLength(studentID, 10);
			isSubjectIDVaild = isLength(subjectID, 7);
			
			if(isstudentIDValid && isSubjectIDVaild) {
				boolean isITStudent = isItstudent(studentID);
				boolean isITSubject = isTtSubject(subjectID);
				System.out.println("");
				System.out.print("Student ID :" +studentID);
				displayData(isITStudent,isITSubject);
				break;
			}else {
				System.out.println(" ");
			}

		}
	}
	public static boolean isLength(String input , int len) {
		return input.length() == len;
		
	}
	public static boolean isItstudent(String checkid) {
		if(checkid.substring(0,6) == "211311") {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isTtSubject(String checksub) {
		if(checksub.substring(0,2) == "21" && checksub.charAt(4) == '1') {
			return true;
		}else {
			return false;
		}
	}
	public static void displayData(boolean isItstudent,boolean isTtSubject) {
		System.out.println(" ");
		if(isItstudent) {
			System.out.print(" 1st year student in IT");
		}
		else if(isItstudent) {
			System.out.print(" is not 1st year student in IT");
		}
		if(isTtSubject) {
			System.out.print("\n not enroll in courses for year 1");
		}
		else if(isTtSubject) {
			System.out.print("\n not enroll in courses for Year 1");
		}
	}

}
