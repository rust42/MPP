package exampractise.Playground;

import java.util.List;

class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
public class Main {

    public static void main(String[] args) {
        List<Employee> people = List.of(
                new Employee("Sandeep", "Koirala"),
                new Employee("Sarita", "Pandey"),
                new Employee("Sabita", "Basnet"),
                new Employee("Sangeeta", "Koirala"),
                new Employee("Sabina", "Adhikari")
        );

        String names = people.stream().reduce("", (u, e) -> e.getFirstName(), (u, v) -> u + "," + v);
        System.out.println(names);
    }


}
