import javax.print.attribute.standard.JobPriority;
import javax.swing.*;

public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input product Name");
		
		String strProductUnit = JOptionPane.showInputDialog("Input product Unit");
		int ProductUnit = Integer.parseInt(strProductUnit);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""
				+ "Input Price per Unit : "));
		double totalPriceofProduct = ProductUnit * productPrice;
		double totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		
		JOptionPane.showMessageDialog(null, "Total price is " + totalPriceofProduct + " Baht "+"\nAdd VAT 7% is "+ totalwithVat + " Baht ");
		

	}

}
