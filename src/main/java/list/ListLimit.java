package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListLimit {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("String1");
		list.add("String2");
		list.add("String3");
		list.add("String4");
		list.add("String5");
		
		list.forEach(System.out::println);
		
		System.out.println("");
		
		System.out.println("Lista limitada a 2 registros");
		// Limitar a quantidade de registros retornados em um list
		List<String> newList = list.stream().limit(2).collect(Collectors.toList());
		newList.forEach(System.out::println);
		
	}
	
	
}
