
public class Product {
private String name;
private double price;
private double vatRate;

public void setProductDetails(String pdname,double pdprice, double pdvatRate) {
	name = pdname;
	price = pdprice;
	vatRate = pdvatRate;
	
}

public double calculateTotalPrice() {
	double total = price + (price * vatRate/100);
	return total;
}
public void displayPoductDetails() {
	System.out.println("Product Details: ");
	System.out.println("Product Name: "+name);
	System.out.println("Price (Before VAT): "+price);
	System.out.println("Price (After VAT): "+calculateTotalPrice());
}
	

}
