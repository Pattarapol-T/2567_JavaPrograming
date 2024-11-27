import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name    : ");
		String productName = input.nextLine();
		System.out.print("Input product util    : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit  : ");
		float productPrice = input.nextFloat();
		System.out.println("--------------------------");
		float totalPricefProduct = productUnit * productPrice;
		System.out.println("Total Price is " + frm.format(totalPricefProduct) + " Baht. ");
		System.out.println("--------------------------");
		System.out.print("How many discount (%) : " );
		int productdiscount = input.nextInt();
		System.out.println("--------------------------");
		double totalwithdown = totalPricefProduct * (productdiscount/100.0f);
		System.out.println("Discount from "+ productdiscount +"%\t" + frm.format(totalwithdown)+ " Baht. " );
		double totalPaid = totalPricefProduct - totalwithdown;
		System.out.println("Amount  to be paid "+ "\t"+ frm.format(totalPaid) + " Baht. ");

	}

}
