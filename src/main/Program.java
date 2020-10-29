/* Script with 5 ways to
 * remove a product of a list
*/
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 85.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 79.00));
		
		for (Product i: list) {
		System.out.println(i);
		}
		System.out.println();
		
		//1 - remove with a static method
		list.removeIf(Product::staticProductPredicate);
		System.out.println("Product removed with Static Method");
		for (Product i: list) {
			System.out.println(i);
		}
		System.out.println();
		
		//add the removed products
		list.add(new Product("TV", 900.00));
		list.add(new Product("Tablet", 350.00));
		
		//2 - remove with a non static method
		list.removeIf(Product::nonStaticProductPredicate);
		System.out.println("Product removed with Non Static Method");
		for (Product i: list) {
			System.out.println(i);
		}
		System.out.println();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Tablet", 350.00));
		
		//3 - remove with a Expression Lambda Declared
		Predicate<Product> pred = p -> p.getProductPrice() >= 100;
		list.removeIf(pred);
		System.out.println("Product removed with Expression Lambda Declared");
		for (Product i: list) {
			System.out.println(i);;
		}
		System.out.println();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Tablet", 350.00));
		
		//4 - remove with a Expression Lambda Inline
		list.removeIf(p -> p.getProductPrice() >= 100);
		System.out.println("Product removed with Expression Lambda Inline");
		for (Product i: list) {
			System.out.println(i);
		}
		System.out.println();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Tablet", 350.00));
		
		//5 - remove with a Interface Implementation
		list.removeIf(new ProductPredicate());
		System.out.println("Product removed with Interface Implementation");
		for (Product i: list) {
			System.out.println(i);
		}
		
		

	}

}
