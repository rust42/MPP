package lesson8.exercise.employeecode;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparatorBad implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
			
	}
}
