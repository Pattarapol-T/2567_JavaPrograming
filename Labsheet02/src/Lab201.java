import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		final int Buffat = 299;
		int isMember;
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customber per bill?"));
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		double totalPrice = Buffat * numberofCustomer;

		do {
			isMember = JOptionPane.showConfirmDialog(null, "TotalPrice is"+frm.format(totalPrice)+ "baht"+"\nDo you have a member card?");
		}while (isMember == JOptionPane.CANCEL_OPTION);
		if(isMember == JOptionPane.YES_OPTION) {
			double PriceAfterDiscount = totalPrice - (totalPrice*10/100);
			JOptionPane.showConfirmDialog(null, "Amount to be paid is "+PriceAfterDiscount +"baht.");
		}else if (isMember == JOptionPane.NO_OPTION) {
			JOptionPane.showConfirmDialog(null, "Amount to be paid is "+totalPrice+"baht.");
		}
	}

}
