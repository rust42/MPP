package Lab11.prob3;
import java.util.*;
import java.util.function.*;


public class Main {

    //simple version
	public static boolean contains1(List<String> list, String s) {
		for(String x: list) {
			if(x == null && s == null) return true;
			if(s == null || x == null) continue;
			if(x.equals(s)) return true;
		}
		return false;	
	}
	
	//your generalization -- should work with lists of
	//Employees, Accounts. You may not override equals
	//in the data-holder classes (like Employee, Account, etc)
	//so you need to find another way to deal with the fact
	//that these classes do not have their own equals methods.
	
	public static <T> boolean contains2(List<T> list, T a, Comparator<T> comparator) {
		for(T x: list) {
			if(x == null && a == null) return true;
			if(a == null || x == null) continue;
			if(comparator.compare(a, x) == 0) {
				return true;
			}
		}
		return false;

	}
	
	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains1(list, "Tom");
		System.out.println(result);
	}
	
	public static void test2() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1003, "Tom", 60000));
		list.add(new Employee(1002, "Harry", 70000));
		list.add(new Employee(1001, "Joe", 50000));
		boolean result = Main.contains2(list, list.get(2), Comparator.comparing(Employee::getId));
		System.out.println(result);

	}
	
	public static void test3() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));

		boolean result = Main.contains2(list, list.get(2), Comparator.comparing(Manager::getId));
		System.out.println(result);

	}
	
	
	
	public static void test4() {
		List<CheckingAccount> list = new ArrayList<>();
		list.add(new CheckingAccount(1001, 25.00));
		list.add(new CheckingAccount(1002, 35.00));
		list.add(new CheckingAccount(1003, 125.00));
		boolean result = Main.contains2(list, list.get(2), Comparator.comparing(CheckingAccount::getAcctId));
		System.out.println(result);


	}
	
	
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}	
		
		
	
}