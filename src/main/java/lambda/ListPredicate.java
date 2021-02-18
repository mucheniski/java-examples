package lambda;

import java.util.ArrayList;
import java.util.List;

import domains.Product;

// Fazer um programa que, a partir de uma lista de produtos, remova da
// lista somente aqueles cujo preço mínimo seja 100.

public class ListPredicate {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double value = 100.00;
		
		list.removeIf(produto -> produto.getPrice() >= value);
		
		for (Product product : list) {
			System.out.println(product);
		}
		
	}
	
}
