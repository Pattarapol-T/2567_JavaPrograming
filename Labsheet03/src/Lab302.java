import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputEmail = JOptionPane.showInputDialog("input your e-mail: ").toLowerCase();
		
		while(inputEmail.startsWith("@") || inputEmail.contains("") ) {
			inputEmail = JOptionPane.showInputDialog("input your e-mail: ");
			
		}
		if (inputEmail.endsWith("@gmail.com")|| inputEmail.endsWith("hotmail.com")) {
			JOptionPane.showMessageDialog(null,"Your e-mail is"+ inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail dot com");
		}

	}

}
