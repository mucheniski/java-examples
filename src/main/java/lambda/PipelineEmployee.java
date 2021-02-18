package lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import domains.Employee;

/*
Fazer um programa para ler os dados (nome, email e salário)
de funcionários a partir de um arquivo em formato .csv.
Em seguida mostrar, em ordem alfabética, o email dos
funcionários cujo salário seja superior a um dado valor
fornecido pelo usuário.
Mostrar também a soma dos salários dos funcionários cujo
nome começa com a letra 'M'.
*/


public class PipelineEmployee {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		String path = "files/employees.csv";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			List<Employee> employees = new ArrayList<>();
			
			// ler os dados (nome, email e salário)
			// de funcionários a partir de um arquivo em formato .csv.
			String line = bufferedReader.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				employees.add(Employee.builder()
										.id(Integer.parseInt(fields[0]))
										.name(fields[1])
										.salary(Double.parseDouble(fields[2]))
									  .build());
				line = bufferedReader.readLine();
			}
			
			
			// mostrar, em ordem alfabética, o email dos
			// funcionários cujo salário seja superior a um dado valor
			System.out.println("Enter a salary to filter: ");
			double filterSalary = sc.nextDouble();
			
			List<String> emails = employees.stream()
							.filter(employee -> employee.getSalary() > filterSalary)
							.map(employee -> employee.getEmail())
							.sorted()
							.collect(Collectors.toList());
			emails.forEach(System.out::println);
			
			
			// soma dos salários dos funcionários cujo
			// nome começa com a letra 'M'.
			double sum = employees.stream()
							.filter(employee -> employee.getName().charAt(0) == 'M')
							.map(employee -> employee.getSalary())
							.reduce(0.0, (salaryX, salaryY) -> salaryX + salaryY);
			System.out.println("Sum of salary or people whose name starts with 'M': " + String.format("%.2f", sum));
							
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	}
	
}
