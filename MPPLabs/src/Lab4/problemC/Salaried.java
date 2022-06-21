package Lab4.problemC;

public class Salaried extends Employee {
    private final double salary;

    Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }
    @Override
    double calcGrossPay(int month, int year) {
        return salary;
    }
}
