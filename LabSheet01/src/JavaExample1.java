import java.util.*;
import java.text.*;
public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name   : ");
		String produckName = input.nextLine();
		System.out.print("Input product util   : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float productPrice = input.nextFloat();
		
		System.out.println();
		
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total Price is" + frm.format(totalPriceofProduct) + " Baht ");
		float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		System.out.println("Add VAT 7% is "+totalwithVat + " Baht " );
		System.out.println();
		
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		System.out.println("Total Price is" + frm.format(totalPriceofProduct) + " Baht ");
		System.out.println("Add VAT 7% is" + frmtotalwithVat + " BaHt ");
		
		input.close();

	}

}
