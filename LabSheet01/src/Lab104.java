import javax.swing.JOptionPane;

public class Lab104 {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null,"Welcome to the payroll application");
		//String name =JOptionPane.showInputDialog(null,"Enter employee name","input",JOptionPane.QUESTION_MESSAGE);
		//String 
		JOptionPane.showMessageDialog(null,"Welcome to the payroll application");

	    String name = JOptionPane.showInputDialog(null,"Enter employee name","input",JOptionPane.QUESTION_MESSAGE);
	    
	    String strWork = JOptionPane.showInputDialog(null,"Enter total hours for this employee");
	    double Work = Integer.parseInt(strWork);

	    double grossEarning = Work*7.5;
	    double tax = grossEarning*0.15;
	    double netEarning = grossEarning-tax;

	    String result = "Employee name: "+name+"\nHour worked: "+Work+"\nHourly wage: $ 7.5\nGross earning: $ "+grossEarning+"\nTax rate: 0.15\nTax: $ "+tax+"\nNet earning: $ "+netEarning;
	    JOptionPane.showMessageDialog(null, result);
	}

}
