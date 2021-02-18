package lambda;

import java.util.ArrayList;
import java.util.List;

import domains.Product;

// Fazer um programa que, a partir de uma lista de produtos, aumente o
// preço dos produtos em 10%.

public class ListConsumer {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double factor = 1.1;
		
		list.forEach(product -> product.setPrice(product.getPrice() * factor));
		
		list.forEach(System.out::println);
		
	}
	
}
