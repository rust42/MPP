package pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import quizclasses.*;

/** USE STREAM PIPELINES TO SOLVE THE PROBLEMS HERE */
public class Main {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		//SAMPLE: Create a stream pipeline that does the following:
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		List<Employee> result = sampleData.stream()
							        .filter(e -> e.getName().length() > 5)
							        .filter(e -> e.getYearOfBirth() > 1970)
							        .collect(Collectors.toList());
		System.out.println(result);
				
		prob1();
		prob2();
		prob3();
	}
	
	//Create a stream pipeline that obtains a list of
	//all name/salary pairs extracted from a list of Employees
	//for which salary > 55000 and less than 120000, in ascending
	//order of name, then descending order of salary
	//Then print the list to the console
	public static void prob1() {
		//use this list 
		List<Employee> list = EmployeeTestData.getList();
		//for which salary > 55000 and less than 120000, in ascending
		//order of name, then descending order of salary

		Comparator<Employee> comparator = Comparator.comparing(Employee::getName)
				.thenComparing(Comparator.comparingInt(Employee::getSalary).reversed());

		list.stream()
				.filter(e -> e.getSalary() > 55000 && e.getSalary() < 120000)
				.sorted(comparator)
				.map(e -> new Pair(e.getName(), e.getSalary()))
				.forEach(System.out::println);


	}
	
	//Create a stream pipeline to find all transactions from year 2011 
	//and sort them by value (small to high), and print to console
	//(Note: there is an instance variable "value" in Transaction)
	public static void prob2() {
		//use this list	
		List<Transaction> list = TraderTransactTestData.getTransactions();
		list.stream()
				.filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.forEach(System.out::println);
	}
	
	// Create a stream pipeline to find all traders from Cambridge, 
	// sort them by name, and print to console
	public static void prob3() {
		//Use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();  
		list.stream()
				.map( e -> e.getTrader())
				.distinct()
				.sorted(Comparator.comparing(t -> t.getName()))
				.filter( t -> t.getCity().equals("Cambridge"))
				.forEach(System.out::println);

	}
}
