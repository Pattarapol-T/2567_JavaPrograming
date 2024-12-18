import javax.swing.*;
public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputEmail();
		
	}
	public static void inputEmail() {
		String ans;
		String VarEmail;
		do {
			VarEmail = JOptionPane.showInputDialog("Input your e-mail");
			if(VarEmail!=null && !VarEmail.isEmpty()) {
				//checkemailError(VarEmail);
			}else {
				JOptionPane.showMessageDialog(null, "Email cannot be empty!!!");
			}
			ans = JOptionPane.showInputDialog("Do you want to input email address(Y/y).");
		}while(ans !=null && ans.equalsIgnoreCase("y"));
		
	}
	public static void checkEmailError(String email) {
		while(email.startsWith("@") || email.contains("") ) {
			email = JOptionPane.showInputDialog("Invalid e-mail. Input your e-mail again.");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null,checkEmail(email)?"Your e-mail is"+email:"Your email is not a hotmail or email address.");
						
	}
	public static boolean checkEmail(String email) {
		/*if(email.endsWith("@email.com") || email.endsWith("@hotmail.com")) {
			return true;
		}else {
			return false;
		}*/
		if(email.endsWith("@email.com") || email.endsWith("@hotmail.com")) {
			return true;
		}
		return false;
		
	}

}
