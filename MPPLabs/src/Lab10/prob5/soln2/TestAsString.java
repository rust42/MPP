package Lab10.prob5.soln2;

import Lab10.prob5.Employee;
import Lab10.prob5.Main;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAsString {

    @Test
    void testLastNameAfterM() {
        assertTrue(EmployeeDetail.lastNameAfterM(new Employee("John", "Sims", 110000)));
        assertFalse(EmployeeDetail.lastNameAfterM(new Employee("Thomas", "Blake", 110000)));
    }

    @Test
    void testSalaryMoreThan100000() {
       assertFalse(EmployeeDetail.salaryGreaterThan100000(new Employee("Andrew", "Reardon", 80000)));
       assertTrue(EmployeeDetail.salaryGreaterThan100000(new Employee("Thomas", "Blake", 110000)));
    }


    @Test
    void testFullName() {
        assertEquals(EmployeeDetail.fullName(new Employee("Andrew", "Reardon", 80000)),
                "Andrew Reardon");
        assertEquals(EmployeeDetail.fullName(new Employee("Alice", "Richards", 101000)),
                "Alice Richards");
    }


    @Test
    void testAsStringWork() {
        List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));
        assertEquals(EmployeeDetail.asString(emps), "Alice Richards, Joe Stevens, John Sims, Steven Walters");
    }

    @Test
    void testWithSingleEmployee() {
        List<Employee> emps = Arrays.asList(new Employee("Joe", "Stevens", 120000));
        assertEquals(Main.asString(emps), "Joe Stevens");
    }

    @Test
    void testWithNoMatchingEmployees() {
        List<Employee> emps = Arrays.asList(new Employee("Joe", "Dtevens", 120000));
        assertEquals(Main.asString(emps), "");
    }

    @Test
    void testWithEmptyEmployees() {
        List<Employee> emps = Arrays.asList();
        assertEquals(Main.asString(emps), "");
    }

}
