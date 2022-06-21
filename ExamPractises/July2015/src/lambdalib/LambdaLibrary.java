package lambdalib;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import quizclasses.*;


public class LambdaLibrary {
	public final static String IMPLEMENT = "implement!";
	
	//sample query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE
	   = (list, namelength, year) -> list.stream()
	                                     .filter(e -> e.getName().length() > namelength)
	                                     .filter(e -> e.getYearOfBirth() > year)
	                                     .collect(Collectors.toList());


	public final static TriFunction<List<Employee>, Integer, Integer, List<Pair>> EMPLOYEE_SALARIES =
			(list, minSalary, maxSalary) -> list.stream()
					.filter(e -> e.getSalary() > 55000 && e.getSalary() < 120000)
					.sorted(Comparator.comparing(Employee::getName)
							.thenComparing(Comparator.comparingInt(Employee::getSalary)
									.reversed()))
					.map(e -> new Pair(e.getName(), e.getSalary()))
					.collect(Collectors.toList());


	public final static BiFunction<List<Transaction>, Integer, List<Transaction>> TRANSACTION_FILTER =
			(list, year) -> list.stream()
					.filter(t -> t.getYear() == year)
					.sorted(Comparator.comparing(Transaction::getValue))
					.collect(Collectors.toList());

	public final static BiFunction<List<Transaction>, String, List<Trader>> TRADER_CITY_FILTER =
			(list, city) -> list.stream()
					.map(Transaction::getTrader)
					.distinct()
					.sorted(Comparator.comparing(Trader::getName))
					.filter(t -> t.getCity().equals(city))
					.collect(Collectors.toList());

}
