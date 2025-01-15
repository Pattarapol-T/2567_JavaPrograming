import java.util.*;
public class TestProductlnput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product Product1 = new Product();
		
		System.out.print("Enter product name: ");
		String pdname = scan.nextLine();
		System.out.print("Enter product price: ");
		double pdprice = scan.nextDouble();
		System.out.print("Enter VAT rate (%): ");
		double pdvatRate = scan.nextDouble();
		
		Product1.setProductDetails(pdname, pdprice, pdvatRate);
		Product1.displayPoductDetails();

	}

}
