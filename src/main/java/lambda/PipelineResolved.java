package lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import domains.Product;

//  Fazer um programa para ler um conjunto de produtos a partir de um
//  arquivo em formato .csv (suponha que exista pelo menos um produto).
//  Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
//  nomes, em ordem decrescente, dos produtos que possuem preço
//  inferior ao preço médio.


public class PipelineResolved {
	
	public static void main(String[] args) {
		
		String path = "files/resolved.csv"; // files Folder into to src
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			List<Product> products = new ArrayList<>();
			
			String line = bufferedReader.readLine();
			while (line != null) {				
				String[] fields = line.split(",");
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = bufferedReader.readLine();
			}
			
			// Average for all products
			double average = products.stream()
									.map(product -> product.getPrice()) // New stream with prices only
									.reduce(0.0, (productX, productY) -> productX + productY) / products.size();
			
			System.out.println("Average price: " + String.format("%.2f", average));
			
			// Names of products with price low to average			
			Comparator<String> alphabeticalOrder = (productName1, productName2) -> productName1.toUpperCase().compareTo(productName2.toUpperCase());
			
			List<String> productNames = products.stream()
							.filter(product -> product.getPrice() < average)
							.map(product -> product.getName()) // New stream with names only
							.sorted(alphabeticalOrder.reversed()) // descending order
							.collect(Collectors.toList());
			
			productNames.forEach(System.out::println);			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
