package stringbuffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import domains.Product;

//  Fazer um programa para ler um conjunto de produtos a partir de um
//  arquivo em formato .csv (suponha que exista pelo menos um produto).
//  Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
//  nomes, em ordem decrescente, dos produtos que possuem preço
//  inferior ao preço médio.


public class LeitorCSV {
	
	public static void main(String[] args) {
		
		String path = "/home/mucheniski/developer/ws-eclipse/expressoes-lambda/files/resolved.csv";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			List<Product> products = new ArrayList<>();
			
			String line = bufferedReader.readLine();
			while (line != null) {				
				String[] fields = line.split(",");
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = bufferedReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
