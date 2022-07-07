package ui;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import domein.Employee;

public class ProcessingEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = {
		         new Employee("Jason", "Red", 5000, "IT"),
		         new Employee("Ashley", "Green", 7600, "IT"),
		         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
		         new Employee("James", "Indigo", 4700.77, "Marketing"),
		         new Employee("Luke", "Indigo", 6200, "IT"),
		         new Employee("Jason", "Blue", 3200, "Sales"),
		         new Employee("Wendy", "Brown", 4236.4, "Marketing")};
		
		List<Employee> list = Arrays.asList(employees);
		
		System.out.println("complete empoyee list");
		list.stream().forEach(System.out::println);
		
		Predicate<Employee> fourToSixThousand = 
				e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
				
		System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary:%n");
		list.stream()
		    .filter(fourToSixThousand)
		    .sorted(Comparator.comparing(Employee::getSalary))
		    .forEach(System.out::println);
		
		System.out.printf("%nFirst employee earning $4000-$6000:%n%s%n",
		list.stream()
		    .filter(fourToSixThousand)
		    .findFirst()
		    .get());
		
		// Functions for getting first and last names from an Employee
		Function<Employee, String> byFirstName = Employee::getFirstName;
		Function<Employee, String> byLastName = Employee::getLastName;
		
		// Comparator for comparing Employees by first name then last name
		Comparator<Employee> lastThenFirst = 
				Comparator.comparing(byLastName).thenComparing(byFirstName);
		
		// sort employees by last name, then first name
		System.out.printf("%nEmployees in ascending order by last name then first:%n");
		list.stream()
		    .sorted(lastThenFirst)
		    .forEach(System.out::println);
		
		// sort employees descending by last name, then first name
		System.out.printf("%nEmployees in descending order by last name then first:%n");
		list.stream()
		    .sorted(lastThenFirst.reversed())
		    .forEach(System.out::println);
		
		//display unique employee last names sorted
		System.out.printf("%nUnique employee last names:%n");
		list.stream()
		    .map(Employee::getLastName)
		    .distinct()
		    .sorted()
		    .forEach(System.out::println);
		
		//display only first and last names
		System.out.printf("%nEmployee names in order by last name then first name:%n");
		list.stream()
		    .sorted(lastThenFirst)
		    .map(Employee::getName)
		    .forEach(System.out::println);
		
		//sum of employee salaries
		System.out.printf("%nsum of employees salaries: %.2f%n", 
				list.stream()
				    .mapToDouble(Employee::getSalary)
				    .sum());
		
		//sum of employee salaries with reduce
		System.out.printf("%nsum of employees salaries: %.2f%n",
				list.stream()
				    .mapToDouble(Employee::getSalary)
				    .reduce(0, (value1, value2) -> value1 + value2));
		
		//average of employee salaries
		System.out.printf("%naverage of employees salaries: %.2f%n", 
				list.stream()
				    .mapToDouble(Employee::getSalary)
				    .average()
				    .getAsDouble());

	}

}
