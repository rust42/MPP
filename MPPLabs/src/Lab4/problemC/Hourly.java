package Lab4.problemC;

public class Hourly extends  Employee {

    private final double hourlyWage;
    private final double hoursPerWeek;

    Hourly(String empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4;
    }
}
