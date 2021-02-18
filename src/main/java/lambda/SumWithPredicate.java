package lambda;

import java.util.ArrayList;
import java.util.List;

import domains.Product;


// Fazer um programa que, a partir de uma lista de produtos, calcule a
// soma dos preços somente dos produtos cujo nome começa com "T".

public class SumWithPredicate {
	
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Tv", 900.00));
		products.add(new Product("Mouse", 50.00));
		products.add(new Product("Tablet", 350.50));
		products.add(new Product("HD Case", 80.90));
		
		ProductService productService = new ProductService();
		
		double sum = productService.filteredSum(products, product -> product.getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
	}

}
