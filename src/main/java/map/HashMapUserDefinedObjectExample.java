package map;

import java.util.HashMap;
import java.util.Map;

import domains.Employee;

public class HashMapUserDefinedObjectExample {
	
	public static void main(String[] args) {
	
		Map<Integer, Employee> employeesMap = new HashMap<>();
		
		employeesMap.put(1001, Employee.builder()
											.id(1001)
											.name("Employee1")
											.city("City1")
									   .build());
		
		employeesMap.put(1002, Employee.builder()
											.id(1002)
											.name("Employee2")
											.city("City2")
									   .build());
		
		employeesMap.put(1003, Employee.builder()
											.id(1003)
											.name("Employee3")
											.city("City3")
									   .build());
		
		System.out.println(employeesMap);
		
	}
}
