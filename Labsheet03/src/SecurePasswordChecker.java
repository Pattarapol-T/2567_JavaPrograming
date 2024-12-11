import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input =new Scanner(System.in);
	
	while(true) {
		System.out.println("Enter your password(type 'exist' to quit");
		String password = input.nextLine();
		
		if(password.equalsIgnoreCase("exit")) {
			System.out.println("Program terminate");
			break;
		}
		String error ="";
		
		if(password.length()< 8) {
			error = "- password be at least 8 characters long\n";
		}
		
		boolean hasUpperCase = false;
		boolean haslowerCase = false;
		boolean hasDigit = false;
		for (int i = 0; i<password.length();i++) {
			char ch = password.charAt(i);
			if (ch >= 'A' && ch <='Z') {
				hasUpperCase = true;
			}
			else if (ch >= 'a' && ch <= 'z') {
				haslowerCase = true;
			}
			else if(ch >= '0' && ch <= '9') {
				hasDigit = true;
			}
			
		}
		if(!hasUpperCase) {
			error +="- password must contain at lease one uppetcase letter(A-Z).\n-";
		}
		if(!hasUpperCase) {
			error +="\n- password must contain at lease one uppetcase letter(a-z).\n-";
		}
		if(!hasUpperCase) {
			error +="\npassword must contain at lease one uppetcase letter(8-9).\\n-\"";
		}
		if (error.isEmpty() ) {
			System.out.println("your passwrd is secure");
			
		}
		else {
			System.out.println("password validation error. ");
			System.out.println(error);
		}
	}
	input.close();

	}

}
