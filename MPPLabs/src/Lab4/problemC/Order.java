package Lab4.problemC;

import java.time.LocalDate;

public class Order {
    private final int orderNo;

    public int getOrderNo() {
        return orderNo;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    private final LocalDate orderDate;
    private final double orderAmount;


    Order(int orderNo, LocalDate orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

}
