package Lab10.prob5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		Main main = new Main();
		main.printEmps(emps);
	}

	public static String asString(List<Employee> employees) {
		return employees
				.stream()
				.filter(e -> (e.getSalary() > 100000))
				.filter(e -> (e.getLastName().charAt(0) > 'M'))
				.map(e -> fullName(e))
				.sorted()
				.collect(Collectors.joining(", "));
	}

	static void printEmps(List<Employee> employees) {
		System.out.println(asString(employees));
	}

	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
