package Lab10.prob5.soln2;

import Lab10.prob5.Employee;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeDetail {

    public static boolean salaryGreaterThan100000(Employee employee) {
        Predicate<Employee> predicate = e -> e.getSalary() > 100000;
        return predicate.test(employee);
    }

    public static boolean lastNameAfterM(Employee employee) {
        Predicate<Employee> predicate = e -> e.getLastName().charAt(0) > 'M';
        return predicate.test(employee);
    }

    public static String fullName(Employee employee) {
        return String.join(" ", new String[]{ employee.getFirstName(),
                employee.getLastName()});
    }

    public static String asString(List<Employee> employees) {
        return employees
                .stream()
                .filter(EmployeeDetail::salaryGreaterThan100000)
                .filter(EmployeeDetail::lastNameAfterM)
                .map(EmployeeDetail::fullName)
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
