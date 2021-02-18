package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMap {
	
	public static void main(String[] args) {
		
		Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 76000.00);
        employeeSalary.put("John", 120000.00);
        employeeSalary.put("Mark", 95000.00);
        employeeSalary.put("Steven", 134000.00);
        
        
        System.out.println("\nIterating over a HashMap using Java 8 forEach and lambda");
        employeeSalary.forEach((employee, salary) -> System.out.println(employee + " ==> " + salary));

        System.out.println("\nIterating over a HashMap values only using forEach and lambda");
        employeeSalary.values().forEach(salary -> System.out.println("Salary: " + salary));

        
        System.out.println("\nIterating over a HashMap's entrySet using iterator");
        Set<Map.Entry<String, Double>> employeeSalaryEntries = employeeSalary.entrySet();
        Iterator<Map.Entry<String, Double>> employeeSalaryIterator = employeeSalaryEntries.iterator();
        while (employeeSalaryIterator.hasNext()) {
        	Map.Entry<String, Double> entry = employeeSalaryIterator.next();
        	System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }        
      
        
		
        System.out.println("\nIterating over the HashMap's entrySet using simple forEach loop");
		for (Map.Entry<String, Double> entry : employeeSalary.entrySet()) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}
        
		
		System.out.println("\nIterating over the HasMap's KeySet");
		employeeSalary.keySet().forEach(employee -> {
			System.out.println(employee + " ==> " + employeeSalary.get(employee));
		});
		
        
	}

}
