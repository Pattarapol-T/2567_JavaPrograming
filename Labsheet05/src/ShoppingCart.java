import javax.swing.*;
public class ShoppingCart {

	public static void main(String[] args) {
		// Call method
		diplayCardAndTotal("Apple",10.5,"Banana",5.75,"Orange",7.3);
		diplayCardAndTotal("Milk",20.0,"Bread",15.0);
		diplayCardAndTotal();
	}
	public static void diplayCardAndTotal(Object... item) {
		if(item.length == 0) {
			System.out.println("No item in the cart. ");
			return;
		}
		System.out.println("item in the cart. ");
		for(int i=0;i<item.length;i+=2) {
			String itemName = (String)item[i];
			double itemPrice = (double)item[i+1] ;
			
			JOptionPane.showMessageDialog(null,
					"- "+itemName +
					": $"+itemPrice);
			
			System.out.printf("- %s : $%.2f%n",itemName,itemPrice);
			
		}
		System.out.println();
		
	}

}
