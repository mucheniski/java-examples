package map;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample {

	public static void main(String[] args) {

		// Creating a HashMap
		Map<String, Integer> numberMapping = new HashMap<>();

		// Adding keyvaluepair to a HashMap
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);

		// Add a keyValue only if not exists on hashmap or is null
		numberMapping.putIfAbsent("Four", 4);

		System.out.println(numberMapping);

	}

}