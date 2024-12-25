import javax.swing.*;
public class Lab02 {
 
	public static void main(String[] args) {
		
		while(true)
		{
			int years = Integer.parseInt(JOptionPane.showInputDialog("Input year: "));
 
			 while (!checkYear(years)) {
		            years = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year, again:"));
		        }//end of while
 
			if (checkYear(years)) {
				if (isLeapYear(years)) {
					JOptionPane.showMessageDialog(null, years + " is Leap year.");
			} else {
				JOptionPane.showMessageDialog(null, years + " is NOT Leap year.");
			}
				break;
			}
		}
	}
	public static boolean isLeapYear(int year) {
		if(year % 4 == 0||year % 100 != 0 || year % 400 == 0) {
				return true;
		}
		return false;
	}
	public static boolean checkYear(int year) {
		if (year >= 1000 && year <= 3000) {
			return true;
		}
		return false;
 
	}
}
 