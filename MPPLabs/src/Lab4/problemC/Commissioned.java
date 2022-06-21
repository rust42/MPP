package Lab4.problemC;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends  Employee {

    private final List<Order> orders;
    private final double commision;
    private final double baseSalary;

    Commissioned(String empId, double commision, double baseSalary) {
        super(empId);
        this.commision = commision;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
    }
    @Override
    double calcGrossPay(int month, int year) {
        LocalDate now = LocalDate.now();
        double totalOrderInPreviousMonth = 0;

        for (Order order: orders) {
            Period monthDifference = Period.between(order.getOrderDate(), now);
            if (monthDifference.getMonths() == 1) {
                totalOrderInPreviousMonth += order.getOrderAmount();
            }
        }

        return baseSalary + totalOrderInPreviousMonth * commision;
    }

    void addOrder(Order order) {
        this.orders.add(order);
    }
}
