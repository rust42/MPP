package Lab2.prob2B;

import java.util.UUID;

public class Factory {

    static Order createOrder() {
        Order order = new Order(UUID.randomUUID().toString());
        OrderLine orderLine = new OrderLine(order);
        order.addOrderLine(orderLine);
        return order;
    }

    public static void main(String[] args) {
        Order order = createOrder();
        System.out.println(order.getOrderNum());
        System.out.println("Number of orders " + order.getOrderLines().size());
        order.addOrderLine(new OrderLine(order));
        System.out.println("Number of orders " + order.getOrderLines().size());
    }
}
