package innerclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lambdalib.TriFunction;
import quizclasses.*;

/** SOLVE THE PROBLEMS HERE BY REPLACING LAMBDA EXPRESSIONS IN YOUR PIPELINE SOLUTIONS 
 *  WITH LOCAL INNER CLASSES
 *
 */
public class Main {
	public static void main(String[] args) {
		
		//SAMPLE: Use local inner classes to replace lambdas in your pipeline solution to 
		//this sample problem:
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		
		class NameLength implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getName().length() > 5;
			}
		}
		class BirthYear implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getYearOfBirth() > 1970;
			}
		}
		prob1();
		prob2();
		prob3();
	}


	//Transform your pipeline solution to prob1 in the pipeline package so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type


	public static void prob1() {

		class EmployeeSalary implements Predicate<Employee> {
			@Override
			public boolean test(Employee employee) {
				return employee.getSalary() > 55000 && employee.getSalary() < 120000;
			}
		}

		class EmployeePairMapper implements Function<Employee, Pair> {
			@Override
			public Pair apply(Employee employee) {
				return new Pair(employee.getName(), employee.getSalary());
			}
		}

		class EmployeeComparator implements Comparator<Employee> {

			@Override
			public int compare(Employee o1, Employee o2) {
				Comparator<Employee> comparator = Comparator.comparing(Employee::getName)
						.thenComparing(Comparator.comparingInt(Employee::getSalary)
								.reversed());
				return comparator.compare(o1, o2);
			}
		}

		//use this list 
		List<Employee> list = EmployeeTestData.getList();


		list.stream()
				.filter(new EmployeeSalary())
				.sorted(new EmployeeComparator())
				.map(new EmployeePairMapper())
				.forEach(System.out::println);
	}
	
	///Transform your pipeline solution to prob2 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob2() {

		class TransactionYear implements Predicate<Transaction> {
			@Override
			public boolean test(Transaction transaction) {
				return transaction.getYear() == 2011;
			}
		}

		class TransactionComparator implements Comparator<Transaction> {
			@Override
			public int compare(Transaction o1, Transaction o2) {
				return Integer.compare(o1.getValue(), o2.getValue());
			}
		}

		//use this list	
		TraderTransactTestData.getTransactions().stream()
				.filter(new TransactionYear())
				.sorted(new TransactionComparator())
				.collect(Collectors.toList())
				.forEach(System.out::println);

	}
	
	//Transform your pipeline solution to prob3 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob3() {

		class TraderMapper implements Function<Transaction, Trader> {
			@Override
			public Trader apply(Transaction transaction) {
				return transaction.getTrader();
			}
		}

		class CityFilter implements Predicate<Trader> {
			@Override
			public boolean test(Trader trader) {
				return trader.getCity().equals("Cambridge");
			}
		}

		//Use this list
		TraderTransactTestData.getTransactions().stream()
				.map(new TraderMapper())
				.distinct()
				.sorted(Comparator.comparing(Trader::getName))
				.filter(new CityFilter())
				.forEach(System.out::println);
		
	                
	}
}
