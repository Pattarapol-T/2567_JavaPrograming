import javax.swing.JOptionPane;

public class Lab501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] idProduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] priceProduct = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };

		double itemPrice = 0.0;
		boolean validitem = false;
		
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		
		
		for(int i=0;i<idProduct.length;i++) {
			if(itemOrder == idProduct[i]) {
				itemPrice = priceProduct[i];
				validitem = true;
			}
		}//end of for
		
		if(validitem) {
			JOptionPane.showMessageDialog(null,"item"+itemOrder+" is "+itemPrice);
			System.out.print("item"+itemOrder+" is "+itemPrice);
		}else {
			JOptionPane.showMessageDialog(null,"Invalid Item","ERROR",JOptionPane.ERROR_MESSAGE);
			System.out.print("Invalid Item");
		}
	}

}
