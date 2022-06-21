package Lab5.problem3;

import java.time.LocalDate;

public class CustOrderFactory {

    private CustOrderFactory() {}

    public static Customer newCustomer(String name) {
        return new Customer("Bob");
    }

    public static Order newOrder(Customer customer, LocalDate date) {
        if(customer == null) throw new NullPointerException("Null customer");
        Order ord = new Order(date);
        customer.addOrder(ord);
        return ord;
    }

    public static void addItem(Order order, String item) {
        order.addItem(item);
    }
}
