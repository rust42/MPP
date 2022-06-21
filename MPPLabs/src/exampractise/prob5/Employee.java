package exampractise.prob5;

public class Employee implements Comparable<Employee> {
	private String name;
	private int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	
	@Override 
	public String toString() {
		return "(" + name + ":" + salary + ")";
	}

	@Override
	public int compareTo(Employee o) {
		if (name.compareTo(o.name) == 0) {
			return Integer.compare(salary, o.salary);
		}
		return name.compareTo(o.name);
	}
}

