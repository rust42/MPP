package Lab9.prob11.B;

import java.util.*;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		Comparator<Employee> comparator = Comparator.comparing(Employee::getFirstName);
		Predicate<Employee> predicate = employee -> employee.getSalary() > 100_000 && employee.getLastName().charAt(0) > 'M';

		String joinedNames = LambdaLibrary.nameFunction.apply(list, predicate, comparator);
		System.out.println(joinedNames);

		Map<String, List<Employee>> map = new HashMap<>();
	}
}
