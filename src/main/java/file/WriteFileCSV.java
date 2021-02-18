package file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import domains.Employee;

public class WriteFileCSV {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("/home/developer/Desktop/test/write.csv");
        Charset charset = StandardCharsets.UTF_8;
          
        List<Employee> employees = new ArrayList<>();
        employees.add(Employee.builder().id(1).name("Employee1").city("City1").email("email1").salary(5000.00).build());
        employees.add(Employee.builder().id(2).name("Employee2").city("City2").email("email2").salary(5000.00).build());
        employees.add(Employee.builder().id(3).name("Employee3").city("City3").email("email3").salary(5000.00).build());

        // Instantiate a BufferedWriter
        try(BufferedWriter writer = Files.newBufferedWriter(filePath, charset)) {            
            // Header
            writer.append("ID;NAME;CITY;EMAIL;SALARY\n");
            
            // Data
            for (Employee employee : employees) {
				writer.append(employee.getId().toString());
				writer.append(";");
				writer.append(employee.getName());
				writer.append(";");
				writer.append(employee.getCity());
				writer.append(";");
				writer.append(employee.getEmail());
				writer.append(";");
				writer.append(employee.getSalary().toString());
				writer.append("\n");
			}

        } catch (IOException ex) {
            System.out.format("I/O error: %s%n", ex);
        }
    }
}