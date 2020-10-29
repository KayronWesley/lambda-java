package entities;

public class Product {
	private String productName;
	private double productPrice;
	
	public Product(String productName, double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return productName + ": " + String.format("%.2f", productPrice);
	}
	
	//example predicate with a static method
	public static boolean staticProductPredicate(Product p) {
		return p.getProductPrice() >= 100;
	}
	
	//example predicate with a non static method
	public boolean nonStaticProductPredicate() {
		return productPrice >= 100;
	}
	

}
